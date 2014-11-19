package pkg.framework.factory;
import pkg.framework.customer.ICustomer;
import pkg.framework.account.IAccount;
import java.util.HashMap;

import pkg.framework.transaction.ITransaction;

public interface IAbstractFactory {

	public   ITransaction createTransaction(IAccount a, String type, double amount);

	public  IAccount createAccount(ICustomer c, String type);

	public   ICustomer createCustomer(HashMap data, String type);

	

}
