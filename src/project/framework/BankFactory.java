package project.framework;
import project.framework.*;
import project.framework.factory.Factory;

public abstract class BankFactory extends Factory {

	public abstract ITransaction createTransaction(IAccount a, String type);

	public abstract IAccount createAccount(ICustomer c);

	public abstract ICustomer createCustomer();

}
