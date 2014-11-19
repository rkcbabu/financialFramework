package project.framework.customer;

import project.framework.customer.ICustomer;
import java.util.List;


import project.framework.Controller;
import project.framework.reporting.Report;

public interface ICustomerManager {
	public boolean addCustomer(ICustomer customer);
	public boolean submitCustomer(ICustomer customer);
	public void setController(Controller controller);
	
        public ICustomer findCustomer(String name);
	public List<ICustomer> getAllCustomer();
	//public void setChanged() ;
	public Report getReport();
}
