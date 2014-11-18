package project.framework.customer;

import java.util.List;

public interface ICustomerManager {

	public abstract void add(ICustomer cus);

	public abstract ICustomer find(int id);

	public abstract List getAll();

	public abstract String getType();

	public abstract void emailNotify();

}
