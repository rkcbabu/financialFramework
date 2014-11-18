package project.framework.transaction;

import project.framework.account.IAccount;

public class Deposit extends ATransaction {

    public Deposit(IAccount a, double amt) {
        super(a, amt);
    }
//	public abstract void execute();
//
//	public abstract void undo();

}
