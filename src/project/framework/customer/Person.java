package project.framework.customer;

import java.util.Date;
import java.util.HashMap;
import project.framework.ui.Report;

public class Person extends ACustomer implements IPerson {
    
    Date dob = null;

     public String getType(){
         return "person";
     }
    public Person(HashMap<String, String> data) {
        super(data.get("name"), data.get("phone"));
        customerAddress = new Address(data.get("street"), data.get("city"), data.get("state"), data.get("zip"));
    }

    public Date getBirthdate() {
        return dob;
    }

    @Override
    public Report getReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
