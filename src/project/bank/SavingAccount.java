package project.bank;

import java.util.HashMap;
import java.util.Map;
import project.framework.account.Account;
import project.framework.customer.ICustomer;
import project.framework.reporting.Report;



public class SavingAccount extends Account{
	double interestRate;
	public SavingAccount(ICustomer customer,double irRate) {
		super(customer);
		this.interestRate = irRate;
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return BankInformation.SAVING;
	}


	@Override
	public Report getReport() {
		Map<String,String> myReport = new HashMap<String, String>();
		myReport.put("Account Number", ""+getId()+"");
		myReport.put("Accuont Type", getType());
		myReport.put("Balance", ""+getCurrentBalance()+"");
		return new Report(myReport);
	}

	@Override
	public double computeInterest() {
		return getCurrentBalance()*interestRate;
	}

}
