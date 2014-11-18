package project.framework.factory;

import project.framework.account.IAccount;
import project.framework.customer.ICustomer;
import project.framework.transaction.*;

public abstract  class AAbstractFactory implements IAbstractFactory {

	public void createTempCustomer() {

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
	public  abstract ICustomer createCustomer() ;
}
