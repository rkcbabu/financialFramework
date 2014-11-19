package pkg.framework.factory;
import pkg.framework.transaction.Withdraw;
import pkg.framework.transaction.Deposit;
import pkg.framework.transaction.ITransaction;
import pkg.framework.customer.ICustomer;
import pkg.framework.account.IAccount;
import pkg.framework.account.Account;
import java.util.HashMap;

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
