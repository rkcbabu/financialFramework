package project.framework.transaction;

import project.framework.account.IAccount;

public class Withdraw extends ATransaction {

    public Withdraw(IAccount a, double amt) {
        super(a, amt);
    }
//
//	private IAccount iAccount;
//
//	public abstract void execute();
//
//	public abstract void undo();

}
