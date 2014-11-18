package project.framework.factory;
import java.util.HashMap;
import project.framework.account.*;
import project.framework.customer.*;

import project.framework.transaction.ITransaction;

public interface IAbstractFactory {

	public   ITransaction createTransaction(IAccount a, String type, double amount);

	public  IAccount createAccount(ICustomer c, String type);

	public   ICustomer createCustomer(HashMap data, String type);

	

}
