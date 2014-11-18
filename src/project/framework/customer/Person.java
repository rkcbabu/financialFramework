package project.framework.customer;

import java.util.Date;
import java.util.HashMap;

public class Person extends ACustomer implements IPerson {
    
    Date dob = null;

    public Person(HashMap<String, String> data) {
        super(data.get("name"), data.get("phone"));
        customerAddress = new Address(data.get("street"), data.get("city"), data.get("state"), data.get("zip"));
    }

    public Date getBirthdate() {
        return dob;
    }

}
