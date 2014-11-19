package project.framework.account;

import project.framework.transaction.Transaction;
import project.framework.customer.ICustomer;
import project.framework.transaction.ITransactionManager;


public abstract class AAccount implements IAccount{
	
	private static int aacNumberStart = 1000;
	private int accountNumber;
	private double currentBalance;
	protected ICustomer customer;
	protected IAccountManager accountManager;
	protected ITransactionManager transactionManger;
	
	public AAccount(int acc_no, ICustomer customer) {
		super();
		this.accountNumber = acc_no;
		this.customer = customer;	
	}
	
	public AAccount(ICustomer customer){
		this.customer = customer;	
		accountNumber = aacNumberStart;
		aacNumberStart++;
		
	}
	
	@Override
	public final void setManagers(IAccountManager accountManger,ITransactionManager transactionManager){
		this.accountManager = accountManger;
		this.transactionManger = transactionManager;
	}
	@Override
	public final void addBalance(double amount){
		currentBalance+=amount;
	}
	@Override
	public final int getAccountNumber() {
		return accountNumber;
	}
	@Override
	public final double getCurrentBalance() {
		return currentBalance;
	}
	@Override
	public final ICustomer getCustomer() {
		return customer;
	}
	@Override
	public final void notifyCustomer(Transaction transaction){
		customer.sendEmail(transaction, this);
	}
	@Override
	public final  void setChanged(){
		accountManager.setAccountChanged();
	}
	@Override
	public String getExpiryDate() {
		// TODO Auto-generated method stub
		return null;
	}
}
