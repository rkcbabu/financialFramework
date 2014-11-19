package project.framework.factory;

import project.framework.transaction.Deposit;
import project.framework.transaction.Withdrawal;
import project.framework.account.Account;
import java.util.ArrayList;
import java.util.List;
import project.framework.CellData;
import project.framework.FormModel;


import project.framework.factory.AbstractFactory;
import project.framework.customer.Address;
import project.framework.customer.ACustomer;
import project.framework.customer.Person;
import project.framework.transaction.Transaction;
import project.framework.account.IAccount;
import project.framework.customer.ICustomer;
import project.framework.customer.ICustomerManager;
import project.framework.ICellData;
import project.framework.reporting.IReportComputer;

public class Factory extends AbstractFactory{

	@Override
	public IReportComputer getReportComputer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ICellData> getDataSet(ICustomerManager customerManager) {
		List<ICellData> list = new ArrayList<ICellData>();
		for(ICustomer c:customerManager.getAllCustomer()){
			for(IAccount a:c.getAllAccount()){
				list.add(new CellData(c, a));
			}
		}
		return list;
	}

	@Override
	public ACustomer createCustomer(FormModel form, String customerType) {
		String name = form.getName();
		String email = form.getEmail();
		String street = form.getStreet();
		String city = form.getCity();
		String state = form.getState();
		String zipCode= form.getZip();
		Address address =new Address(street, city, zipCode, state);
		return new Person(address, name, email,"");
	}

	@Override
	public IAccount createAccount(FormModel form, ICustomer customer,
			String accountType) {
		//process the form for any field required to create the account, 
		//in this case the application itself generates the account number
		return new Account(customer);
	}

	@Override
	public Transaction getTransaction(IAccount account, double amount,
			String type) {
		if(type.equals("deposit")){
			return new Deposit(account, amount, "");
		}
		else{
			return new Withdrawal(account, amount, "");
		}
	}

	

}
