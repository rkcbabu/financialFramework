package project.framework.customer;

import project.framework.customer.ICustomer;
import java.util.List;


import project.framework.Controller;
import project.framework.reporting.Report;

public interface ICustomerManager {
	public boolean add(ICustomer customer);
	public boolean submitCustomer(ICustomer customer);
	public void setController(Controller controller);
	
        public ICustomer find(String name);
	public List<ICustomer> getAll();
	//public void setChanged() ;
	public Report getReport();
}
