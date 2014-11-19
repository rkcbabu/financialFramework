package pkg.framework.customer;

import java.util.List;
import pkg.framework.ui.Report;
import pkg.frameworksearch.Predicate;

public interface ICustomerManager {

	public  void add(ICustomer cus);

	public  ICustomer find(int id);

	public  List<ICustomer> getAll();

	public  String getType();

	public  void emailNotify();
        
            public Report getReport();

}
