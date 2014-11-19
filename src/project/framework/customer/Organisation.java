package project.framework.customer;

import project.framework.customer.ACustomer;
import java.util.HashMap;
import java.util.Map;


import project.framework.account.IAccount;
import project.framework.transaction.Transaction;
import project.framework.reporting.Report;

public class Organisation extends ACustomer{
	private int numberOfEmployee;
	public Organisation(Address address, String name, String email,int numEmployee) {
		super(address, name, email);
		this.numberOfEmployee = numEmployee;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkEmailSendingCondition(Transaction transaction) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Organisation";
	}

	@Override
	public Report getReport() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Name", getName());
		map.put("Customer Type", getType());
		Report myReport = new Report(map);
		for(IAccount a: getAll()){
			myReport.addChildReport(a.getReport());
		}
		return myReport;
	}

}
