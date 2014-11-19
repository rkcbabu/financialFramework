package project.framework.account;

import project.framework.transaction.Transaction;
import project.framework.customer.ICustomer;
import project.framework.transaction.ITransactionManager;


public abstract class AAccount implements IAccount{
	
	
	private int accId;
	private double currentBalance;
	protected ICustomer customer;
	protected IAccountManager accountManager;
	protected ITransactionManager transactionManger;
	
	public AAccount(int accId, ICustomer customer) {
		super();
		this.accId = accId;
		this.customer = customer;	
	}
	
	public AAccount(ICustomer customer){
		this.customer = customer;	
		accId = 0;
		accId++;
		
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
	public final int getId() {
		return accId;
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
