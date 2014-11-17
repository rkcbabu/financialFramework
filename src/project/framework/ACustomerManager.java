package project.framework;

import java.util.List;

public abstract class ACustomerManager implements ICustomerManager {

	private String type;

	public abstract void emailNotify();


	/**
	 * @see ICustomerManager#add(ICustomer)
	 * 
	 *  
	 */
	public void add(ICustomer cus) {

	}


	/**
	 * @see ICustomerManager#find(int)
	 * 
	 *  
	 */
	public ICustomer find(int id) {
		return null;
	}


	/**
	 * @see ICustomerManager#findAll()
	 * 
	 *  
	 */
	public List findAll() {
		return null;
	}


	/**
	 * @see ICustomerManager#getType()
	 * 
	 *  
	 */
	public String getType() {
		return null;
	}

}
