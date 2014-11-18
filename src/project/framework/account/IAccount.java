package project.framework.account;

import project.framework.customer.ICustomer;

public interface IAccount {

//	private AccType accType;
//
//	private ICustomer iCustomer;
//
//	private AccountInfo accountInfo;
//
//	private ICustomer iCustomer;

	public double getBalance();
        public ICustomer getCustomer();

	public void deposit(double amt);

	public void withdraw(double amt);
        public int getId();
        public  void sendEmail();

}
