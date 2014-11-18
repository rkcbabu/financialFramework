package project.framework.customer;

import java.util.List;
import project.frameworksearch.Predicate;

public interface ICustomerManager {

	public  void add(ICustomer cus);

	public  ICustomer find(int id, Predicate p);

	public  List<ICustomer> getAll();

	public  String getType();

	public  void emailNotify();

}
