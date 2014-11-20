package project.ccard;

import java.util.HashMap;
import java.util.Map;
import project.framework.account.Account;
import project.framework.customer.ICustomer;
import project.framework.reporting.Report;
import project.framework.transaction.ITransaction;
import project.logic.IsGreater;
import project.logic.IsPerson;

public class SilverCCardAccount extends Account {

    private double monthlyInterest;
    private double monthlyPayment;
    private String expiryDate;

    public SilverCCardAccount(int acc_no, ICustomer customer, String expiryDate) {
        super( customer);
        monthlyInterest = 0.08;
        monthlyPayment = 0.12;
        this.expiryDate = expiryDate;
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return "silver";
    }

     @Override
    public  void addBalance(ITransaction txn) {
       
        validator=new IsPerson();
        if(validator.execute(getCustomer())){
            validator=new IsGreater();
            
            if(validator.isGreater(txn.getAmount(), 400.00) || (this.getCurrentBalance()+txn.getAmount())<0)
            getCustomer().sendEmail(txn, this);
        }
       
        super.addBalance(txn);
        //currentBalance += amount;
    }
    @Override
    public Report getReport() {
        Map<String, String> myReport = new HashMap<String, String>();
        myReport.put("Account Number", "" + getId() + "");
        myReport.put("Account Type", "" + getType());
        myReport.put("*******Transactions********", "");

        Report report = new Report(myReport);

        ReportComputer reportComputer = new ReportComputer();
        transactionManger.computeReport(this, reportComputer);
        report.addChildReport(reportComputer.getReport());
        return report;
    }

    @Override
    public String getExpiryDate() {
        // TODO Auto-generated method stub
        return expiryDate;
    }

    @Override
    public double computeInterest() {
        // TODO Auto-generated method stub
        return getCurrentBalance() * monthlyInterest;
    }

}
