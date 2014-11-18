package project.framework;

import project.framework.transaction.ITransaction;

public abstract class Factory extends AAbstractFactory {

	public abstract ITransaction createTransaction(IAccount a, String type);

	public abstract IAccount createAccount(ICustomer c);

	public abstract ICustomer createCustomer();

}
