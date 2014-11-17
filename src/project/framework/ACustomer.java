package project.framework;

public abstract class ACustomer implements ICustomer {

	private String name;

	private String phone;

	public abstract void addAccount(IAccount acc);

	public abstract void removeAccount(IAccount acc);


	/**
	 * @see ICustomer#getInfo()
	 * 
	 *  
	 */
	public String getInfo() {
		return null;
	}


	/**
	 * @see ICustomer#sendEmail()
	 * 
	 *  
	 */
	public void sendEmail() {

	}

}
