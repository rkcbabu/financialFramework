package project.framework;
import project.framework.*;
import project.framework.factory.Factory;

import project.framework.transaction.ITransaction;

public abstract class BankFactory extends Factory {

	public abstract ITransaction createTransaction(IAccount a, String type);

	public abstract IAccount createAccount(ICustomer c);

	public abstract ICustomer createCustomer();

}
