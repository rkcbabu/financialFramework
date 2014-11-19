package project.framework;

import java.util.List;
import java.util.Observable;
import java.util.Observer;


import project.app.FormModel;
import project.framework.factory.IAbstractFactory;
import project.framework.account.IAccount;
import project.framework.account.IAccountManager;
import project.framework.customer.ICustomerManager;
import project.framework.IDataSet;
import project.framework.transaction.ITransactionManager;
import project.framework.reporting.Report;

public class Controller implements Observer {
	private IAccountManager accountServiceManager;
	private ICustomerManager customerServiceManager;
	private ITransactionManager transactionServiceManager;
	private IAbstractFactory abstractFactory;
	private UIController uiController;
	
	public Controller(UIController uiController ) {
		abstractFactory = null; 
		this.uiController = uiController;
		if(uiController!=null)
		uiController.setController(this);
		
	}
	
	public void injectServiceProviders(ICustomerManager customerManager,IAccountManager accountManager, 
			ITransactionManager transactionManager,IAbstractFactory factory){
		
		this.abstractFactory = factory;
		this.customerServiceManager = customerManager;
		this.accountServiceManager = accountManager;
		this.transactionServiceManager = transactionManager;
		
		
		customerManager.setController(this);
		accountManager.setController(this);
		if(abstractFactory!=null){
			abstractFactory.setManagers(customerManager, accountManager, transactionManager);
		}
		else
			System.out.println("Factory not Set!!! Please set inject the factory");
	}
	
	public void setUIController(UIController uiController){
		this.uiController = uiController;
	}
	
	public boolean executeTransaction(int accountNumber, double amount, String type){
		IAccount account = accountServiceManager.findAccount(accountNumber);
		if(account!=null){
				abstractFactory.createTransaction(account, amount, type);
				return true;
		}
		return false;
	}
	
	public boolean createCustomer(FormModel form, String customerType, String accountType ){
		abstractFactory.createCustomerTemplate(form, customerType, accountType);		
		return true;
	}
	
	public void dataSetChanged(){
		//List<IDataSet> dataSetList = abstractFactory.getDataSet(customerManager);
		//viewController.updateTable(dataSetList);
	}
	
	public Report getReport(){
		return customerServiceManager.getReport();
	}
	
	public void addInterest(){
		List<IAccount> accounts = accountServiceManager.getAllAccounts();
		for(IAccount account: accounts){
			double interest = account.computeInterest();
			abstractFactory.createTransaction(account, interest, "addinterest");
		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		List<IDataSet> dataSetList = abstractFactory.getDataSet(customerServiceManager);
                if(uiController == null){
                    System.err.println("uiController is not set");
                }else
		uiController.updateTable(dataSetList);

	}

}
