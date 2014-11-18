package project.framework.account;

public interface IAccount {

//	private AccType accType;
//
//	private ICustomer iCustomer;
//
//	private AccountInfo accountInfo;
//
//	private ICustomer iCustomer;

	public abstract double getBalance();

	public abstract void deposit(double amt);

	public abstract void withdraw(double amt);

}
