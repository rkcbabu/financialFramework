package project.framework.account;

import java.util.HashMap;
import java.util.Map;
import project.framework.account.AAccount;
import project.framework.customer.ICustomer;
import project.framework.reporting.Report;

public class Account extends AAccount {

	public Account(ICustomer customer) {
		super(customer);
	}
	@Override
	public String getType() {
		return "Account";
	}

	@Override
	public Report getReport() {
		Map<String,String> myReport = new HashMap<String, String>();
		myReport.put("Account ID", ""+getId()+"");
		myReport.put("Balance", ""+getCurrentBalance()+"");
		return new Report(myReport);
	}

	@Override
	public double computeInterest() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getExpiryDate() {
		// TODO Auto-generated method stub
		return null;
	}


}
