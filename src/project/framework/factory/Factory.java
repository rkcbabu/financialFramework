package project.framework.factory;
import project.framework.account.*;
import project.framework.customer.*;
import project.framework.*;

import project.framework.transaction.*;

public  class Factory extends AAbstractFactory {

	public  ICustomer createCustomer(){
            return null;
        }

        public ITransaction createTransaction(IAccount a, String type, double amount) {
 ITransaction newTransaction=null;
            
            if(type.equalsIgnoreCase("withdraw"))
                
		newTransaction=new Deposit(a,amount);
            else if (type.equalsIgnoreCase("deposit")){
                newTransaction=new Withdraw(a,amount);
            }
            
            return newTransaction;    }

    

    

    @Override
    public IAccount createAccount(ICustomer c) {
        
      
       
        IAccount acc=new Account(c);
        return acc;
        
        
       
       
        
    }

    

    

   

   

         

}
