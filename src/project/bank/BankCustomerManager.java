package project.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import project.framework.customer.CustomerManager;
import project.framework.customer.ICustomer;
import project.framework.reporting.Report;
public class BankCustomerManager extends CustomerManager {
	private List<ICustomer> customers = new ArrayList<ICustomer>();
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
