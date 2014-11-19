  package pkg.framework.factory;

import pkg.framework.transaction.ITransaction;
import pkg.framework.customer.Person;
import pkg.framework.customer.Organization;
import pkg.framework.customer.ICustomer;
import java.util.HashMap;
import pkg.framework.account.IAccount;

public abstract  class AAbstractFactory implements IAbstractFactory {

	

	/**
	 * @see IAbstractFactory#createTransaction(IAccount, java.lang.String)
	 */
	public ITransaction createTransaction(IAccount a, String type, double amount) {
            
            return null;
	}
          @Override
    public ICustomer createCustomer(HashMap data, String type) {

        if(type.equalsIgnoreCase("organization"))
            return new Organization(data);
        else
        return new Person(data);
    }



	/**
	 * @see IAbstractFactory#createAccount(ICustomer)
	 */
       
       
      
	
	/**
	 * @see IAbstractFactory#createCustomer()
	 */
}
