package project.framework.customer;

import java.util.HashMap;
import project.framework.account.IAccount;

public class Organization extends ACustomer implements ICustomer, IOrganization {

    protected int numEmployess;

    public Organization(HashMap<String, String> data) {
        super(data.get("name"), data.get("phone"));
        customerAddress = new Address(data.get("street"), data.get("city"), data.get("state"), data.get("zip"));
    }

    /**
     * @see IOrganization#getEmployeeCount()
     */
    public int getEmployeeCount() {
        return numEmployess;
    }

}
