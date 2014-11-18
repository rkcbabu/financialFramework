package project.framework.customer;

import java.util.*;
import project.framework.ui.Report;

public class CustomerManager extends ACustomerManager {
    public CustomerManager(){
        
    }

    @Override
    public void emailNotify() {
        for (ICustomer a : customers) {
            a.sendEmail();
        }
    }
    private List<ICustomer> customers = new Vector<ICustomer>();

    public boolean addCustomer(ICustomer customer) {
        return customers.add(customer);
    }

    public List<ICustomer> getAllCustomer() {
        return customers;

    }

    @Override
    public Report getReport() {
        Map<String, String> map = new HashMap<String, String>();
        List<ICustomer> customers = getAllCustomer();
        map.put("Total Customers", "" + customers.size() + "");
        Report myReport = new Report(map);
        for (ICustomer c : customers) {
            myReport.addChildReport(c.getReport());
        }
        return myReport;
    }

   
}
