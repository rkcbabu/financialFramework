package project.framework.factory;

import java.util.HashMap;
import project.framework.account.IAccount;
import project.framework.customer.*;
import project.framework.transaction.*;

public abstract  class AAbstractFactory implements IAbstractFactory {

	public ICustomer createTempCustomer(HashMap data) {

                ICustomer cus=new Person(data);
                return cus;
	}


	/**
	 * @see IAbstractFactory#createTransaction(IAccount, java.lang.String)
	 */
	public ITransaction createTransaction(IAccount a, String type, double amount) {
            
            return null;
	}


	/**
	 * @see IAbstractFactory#createAccount(ICustomer)
	 */
       
       
      
	
	/**
	 * @see IAbstractFactory#createCustomer()
	 */
	public  abstract ICustomer createCustomer(HashMap data);
}
