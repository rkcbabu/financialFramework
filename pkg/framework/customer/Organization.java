package pkg.framework.customer;

import java.util.HashMap;
import pkg.framework.account.IAccount;
import pkg.framework.ui.Report;

public class Organization extends ACustomer implements ICustomer, IOrganization {

    protected int numEmployess;

     public String getType(){
         return "organization";
     }
    public Organization(HashMap<String, String> data) {
        super(data.get("name"), data.get("phone"),data.get("email"));
        customerAddress = new Address(data.get("street"), data.get("city"), data.get("state"), data.get("zip"));
    }

    /**
     * @see IOrganization#getEmployeeCount()
     */
    public int getEmployeeCount() {
        return numEmployess;
    }

    @Override
    public Report getReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
