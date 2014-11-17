package project.framework;

public class AAbstractFactory implements IAbstractFactory {

	public void createTempCustomer() {

	}


	/**
	 * @see IAbstractFactory#createTransaction(IAccount, java.lang.String)
	 */
	public ITransaction createTransaction(IAccount a, String type) {
		return null;
	}


	/**
	 * @see IAbstractFactory#createAccount(ICustomer)
	 */
	public IAccount createAccount(ICustomer c) {
		return null;
	}


	/**
	 * @see IAbstractFactory#createCustomer()
	 */
	public ICustomer createCustomer() {
		return null;
	}

}
