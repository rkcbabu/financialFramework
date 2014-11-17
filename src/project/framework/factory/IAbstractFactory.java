package project.framework.factory;
import project.framework.*;

public interface IAbstractFactory {

	public abstract ITransaction createTransaction(IAccount a, String type);

	public abstract IAccount createAccount(ICustomer c);

	public abstract ICustomer createCustomer();

	public void createTempCustomer();

}
