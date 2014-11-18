package project.framework.customer;

import java.util.List;

public interface ICustomerManager {

	public  void add(ICustomer cus);

	public  ICustomer find(int id);

	public  List getAll();

	public  String getType();

	public  void emailNotify();

}
