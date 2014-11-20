package project.framework.transaction;

import project.framework.account.IAccount;

public interface ITransaction {

//	private IAccount iAccount;
    public Double getAmount();

    public void execute();

    public String getType();

    public String getDate();

    public IAccount getAccount();

}
