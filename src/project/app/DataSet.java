package project.app;

import java.util.Vector;

import project.framework.account.IAccount;
import project.framework.customer.ICustomer;
import project.framework.IDataSet;


public class DataSet implements IDataSet<Integer>{
    public ICustomer customer;
    public IAccount account;
	
    
	public DataSet(ICustomer customer, IAccount account) {
		super();
		this.customer = customer;
		this.account = account;
	}

	@Override
	public Vector<String> toVector() {
		 Vector<String> newRow = new Vector<String>();
	        newRow.add(customer.getName());
	        //newRow.add(customer.getType());
	        newRow.add(""+account.getAccountNumber()+"");
	        //newRow.add(account.getType());
	        newRow.add(""+account.getCurrentBalance()+"");
	        return newRow;
	}

	@Override
	public Integer getData() {
		return account.getAccountNumber();
	}

}
