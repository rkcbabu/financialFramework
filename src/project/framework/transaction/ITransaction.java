package project.framework.transaction;

import project.framework.account.IAccount;

public interface ITransaction {

//	private IAccount iAccount;
    public  void execute();

    public  void undo();
    public String getType();

}
