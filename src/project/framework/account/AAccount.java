package project.framework.account;

public abstract class AAccount implements IAccount {

	private double balance;

	public abstract void getBalance();

	/**
	 * @see IAccount#deposit()
	 * 
	 *  
	 */
	public void deposit(double amt) {
            balance += amt;
	}


	/**
	 * @see IAccount#withdraw()
	 * 
	 *  
	 */
	public void withdraw(double amt) {
            balance -= amt;
	}

}