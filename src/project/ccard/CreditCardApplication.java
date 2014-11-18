/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ccard;

import java.util.HashMap;
import project.framework.Controller;
import project.framework.IController;
import project.framework.account.AccountManager;
import project.framework.account.IAccount;
import project.framework.customer.CustomerManager;
import project.framework.customer.ICustomer;
import project.framework.factory.Factory;
import project.framework.transaction.TransactionManager;
import project.ccard.*;

/**
 *
 * @author acer
 */
public class CreditCardApplication {
    
    public static void main(String[] args){
         IController controller=new Controller();
       
        controller.setAccountServiceManager(new AccountManager());
        controller.setCustomerServiceManager(new CustomerManager());
        controller.setTransactionServiceManager(new TransactionManager());
        controller.setCreationServiceManager(new CreditCardFactory());
        controller.setUIServiceManager(null); // add default UI service manager
        
        
        HashMap<String, String> userdata=new HashMap<String, String>();
        //userdata.add("name","Krishna");
        userdata.put("name", "Krishna");
        userdata.put("email", "abc@gmail.com");
        userdata.put("street", "myStreet");
        userdata.put("city", "myCity");
        userdata.put("zip", "668");
        
        
        
        
        
       ICustomer customer=controller.createCustomer(userdata,"organization");
       IAccount account=controller.createAccount(customer,"gold");
      
       
       
       customer.addAccount(account);
       
       
       controller.addAccount(account);
       controller.addCustomer(customer);
      //  System.out.println(controller.getAllAccounts().get(0).getId());
       
        System.out.println(controller.findCustomer(1).getInfo());
       
        System.out.println(controller.getAllAccounts().get(0).getCustomer().getId());
      
    }
}
