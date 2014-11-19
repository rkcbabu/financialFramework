package project.framework.factory;

import java.util.List;
import project.framework.FormModel;
import project.framework.account.IAccount;
import project.framework.account.IAccountManager;
import project.framework.transaction.Transaction;
import project.framework.customer.ICustomer;
import project.framework.customer.ICustomerManager;
import project.framework.transaction.ITransaction;
import project.framework.transaction.ITransactionManager;

public abstract class AbstractFactory implements IAbstractFactory {
	private ICustomerManager customerManager;
	private IAccountManager accountManager;
	private ITransactionManager transactionManager;
	
	@Override
	 public final void createCustomer(FormModel form, String customerType,
			String accountType) {
		
		ICustomer customer = createCustomer(form, customerType);
		IAccount account = createAccount(form, customer, accountType);
		account.setManagers(accountManager, transactionManager);
		customer.add(account);
		customerManager.submitCustomer(customer);
		accountManager.add(account);
	}
	
	 @Override
	public final void setManagers(ICustomerManager customerManager,IAccountManager accountManager,
			 ITransactionManager transactionManage){
		 
		this.customerManager = customerManager;
		this.accountManager = accountManager;
		this.transactionManager = transactionManage;
	}
	
	@Override
	public final ITransaction createTransaction(IAccount account, double amount,
			String type) {
		
		ITransaction transaction = getTransaction(account, amount, type);
		transactionManager.doTransaction(transaction);
		return transaction;
	}
	
	@Override
	public void createInterestTransactions(List<IAccount> accountList) {
		for(IAccount account: accountList){
			double interest = account.computeInterest();
			ITransaction transaction = getTransaction(account, interest,"addinterest");
			transactionManager.doTransaction(transaction);
		}
		
	}

}
