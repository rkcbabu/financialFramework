package project.bank;

import java.util.HashMap;
import java.util.Map;
import project.framework.account.Account;
import project.framework.customer.ICustomer;
import project.framework.reporting.Report;
import project.framework.transaction.ITransaction;
import project.framework.logic.IsGreater;
import project.framework.logic.IsPerson;

public class Saving extends Account {

    double interestRate;

    public Saving(ICustomer customer, double irRate) {
        super(customer);
        this.interestRate = irRate;
    }
    
      @Override
    public  void addBalance(ITransaction txn) {
       
        validator=new IsPerson();
        if(validator.execute(getCustomer())){
            validator=new IsGreater();
            
            if(validator.isGreater(txn.getAmount(), 500.00) || (this.getCurrentBalance()+txn.getAmount())<0)
            getCustomer().sendEmail(txn, this);
        }
       
        super.addBalance(txn);
        //currentBalance += amount;
    }

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return BankInformation.SAVING;
    }

    @Override
    public Report getReport() {
        Map<String, String> myReport = new HashMap<String, String>();
        myReport.put("Account Number", "" + getId() + "");
        myReport.put("Accuont Type", getType());
        myReport.put("Balance", "" + getCurrentBalance() + "");
        return new Report(myReport);
    }

    @Override
    public double computeInterest() {
        return getCurrentBalance() * interestRate / 100;
    }

}
