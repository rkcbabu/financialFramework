package project.framework.customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import project.framework.customer.ACustomerManager;
import project.framework.customer.ICustomer;
import project.framework.reporting.Report;


public class CustomerManager extends ACustomerManager {
	private List<ICustomer> customers = new ArrayList<ICustomer>();
	
	@Override
	public boolean add(ICustomer customer){
		return customers.add(customer);
	}
	@Override
	public ICustomer find(String name){
		return null;
		
	}
	@Override
	public List<ICustomer> getAll(){
		return customers;
		
	}
	@Override
	public Report getReport() {
		Map<String, String> map = new HashMap<String, String>();
		List<ICustomer> customers= getAll();
		map.put("Total Customers", ""+customers.size()+"");
		Report myReport = new Report(map);
		for(ICustomer c: customers){
			myReport.addChildReport(c.getReport());
		}
		return myReport;
	}
	

}
