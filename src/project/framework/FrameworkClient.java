package project.framework;

import java.util.HashMap;
import project.framework.*;
import project.framework.customer.*;
import project.framework.factory.*;
public class FrameworkClient {

    public  static void main(String[] args){
       
        IController controller=new Controller();
        IAbstractFactory finaceFactory=new Factory();
        
        
        HashMap<String, String> userdata=new HashMap<String, String>();
        //userdata.add("name","Krishna");
        userdata.put("name", "Krishna");
        userdata.put("email", "abc@gmail.com");
        userdata.put("street", "myStreet");
        userdata.put("city", "myCity");
        userdata.put("zip", "myzip");
        
        
        
        
        
       ICustomer customer=finaceFactory.createCustomer(userdata);
        
    }
}
