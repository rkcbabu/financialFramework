  package project.framework.factory;

import java.util.HashMap;
import project.framework.account.IAccount;
import project.framework.customer.*;
import project.framework.transaction.*;

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
