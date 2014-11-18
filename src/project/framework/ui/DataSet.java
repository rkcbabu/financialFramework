/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.framework.ui;

import java.util.Vector;
import project.framework.account.IAccount;
import project.framework.customer.ICustomer;

/**
 *
 * @author Ram Krishna Chaulagai< rkcbabu@gmail.com >
 */
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
//	        newRow.add(customer.getName());
//	        //newRow.add(customer.getType());
//	        newRow.add(""+account.getAccountNumber()+"");
//	        //newRow.add(account.getType());
//	        newRow.add(""+account.getCurrentBalance()+"");
	        return newRow;
	}

	@Override
	public Integer getData() {
		return account.getId();
	}

}
