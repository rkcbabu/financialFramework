package project.framework;

public interface ICustomer {

//	private IAddress iAddress;

	public abstract String getInfo();

	public abstract void addAccount(IAccount acc);

	public abstract void removeAccount(IAccount acc);

	public abstract void sendEmail();

}
