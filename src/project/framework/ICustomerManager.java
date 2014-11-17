package project.framework;

import java.util.List;

public interface ICustomerManager {

//	private ICustomer iCustomer;

	public abstract void add(ICustomer cus);

	public abstract ICustomer find(int id);

	public abstract List findAll();

	public abstract String getType();

	public abstract void emailNotify();

}
