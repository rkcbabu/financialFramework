package pkg.framework.transaction;

import pkg.framework.account.IAccount;

public interface ITransaction {

//	private IAccount iAccount;
    public  void execute();

    public  void undo();
    public String getType();

}
