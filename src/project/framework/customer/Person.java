package project.framework.customer;

import java.util.Date;
import java.util.HashMap;

public class Person extends ACustomer implements IPerson {

    Address customerAddress;
    Date dob=null;
    public Person(HashMap<String, String> data){
        customerAddress=new Address(data.get("street"),data.get("city"),data.get("state"),data.get("zip"));
      
        name=data.get("name");
        phone=data.get("phone");
        
       // dob=((Date)data.get("dob"));
    }
    
	 public Date getBirthdate(){
             return dob;
         }

}
