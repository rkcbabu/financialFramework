package project.framework.transaction;

import project.framework.account.IAccount;

public interface ITransaction {

//	private IAccount iAccount;
    public abstract void execute();

    public abstract void undo();

}
