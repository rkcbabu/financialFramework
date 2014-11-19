/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg.ccard;

import java.util.HashMap;
import pkg.framework.Controller;
import pkg.framework.IController;
import pkg.framework.account.AccountManager;
import pkg.framework.account.IAccount;
import pkg.framework.customer.CustomerManager;
import pkg.framework.customer.ICustomer;
import pkg.framework.transaction.ITransaction;
import pkg.framework.transaction.TransactionManager;

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
       // account id 1
      
       
       
       customer.addAccount(account);
       
       
      
       controller.addCustomer(customer);
       
       ITransaction tn=controller.createTransaction(1, "charge", 50.00);
       
       controller.requestTransaction(tn);
       
      //  System.out.println(controller.getAllAccounts().get(0).getId());
       
        System.out.println(controller.findCustomer(1).getInfo());
       
        System.out.println(controller.getAllAccounts().get(0).getCustomer().getId());
      
    }
}