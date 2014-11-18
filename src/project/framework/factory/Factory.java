package project.framework.factory;
import java.util.HashMap;
import project.framework.account.*;
import project.framework.customer.*;
import project.framework.transaction.*;

public  class Factory extends AAbstractFactory {
    
//    
    public ITransaction createTransaction(IAccount a, String type, double amount) {
 ITransaction newTransaction=null;
            
            if(type.equalsIgnoreCase("withdraw"))
                
		newTransaction=new Deposit(a,amount);
            else if (type.equalsIgnoreCase("deposit")){
                newTransaction=new Withdraw(a,amount);
            }
            
            return newTransaction;    }

    

    

    @Override
    public IAccount createAccount(ICustomer c, String type) {
        
      
        
       
        IAccount acc=new Account(c);
        return acc;
        
        
       
       
        
    }

  
    
   

   

    

    
    

    

   

   

         

}
