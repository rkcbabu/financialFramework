package project.framework.transaction;

import project.framework.account.IAccount;

public class Withdraw extends ATransaction {

    public Withdraw(IAccount a, double amt) {
        super(a, amt);
    }
//
//	private IAccount iAccount;
//
	public void execute(){
            account.withdraw(amount);
        }
//
//	public abstract void undo();

}
