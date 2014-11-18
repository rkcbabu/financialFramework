package project.framework;

import java.util.HashMap;
import project.framework.account.AccountManager;
import project.framework.account.IAccount;
import project.framework.customer.*;
import project.framework.factory.*;
import project.framework.transaction.TransactionManager;
public class FrameworkClient {

    public  static void main(String[] args){
       
        IController controller=new Controller();
       
        controller.setAccountServiceManager(new AccountManager());
        controller.setCustomerServiceManager(new CustomerManager());
        controller.setTransactionServiceManager(new TransactionManager());
        controller.setCreationServiceManager(new Factory());
        controller.setUIServiceManager(null); // add default UI service manager
        
        
        HashMap<String, String> userdata=new HashMap<String, String>();
        //userdata.add("name","Krishna");
        userdata.put("name", "Krishna");
        userdata.put("email", "abc@gmail.com");
        userdata.put("street", "myStreet");
        userdata.put("city", "myCity");
        userdata.put("zip", "668");
        
        
        
        
        
       ICustomer customer=controller.createCustomer(userdata,"organization");
       IAccount account=controller.createAccount(customer,"");
      
       
       
       customer.addAccount(account);
       
       
       controller.addAccount(account);
       controller.addCustomer(customer);
       
      
       
       
    }
}
