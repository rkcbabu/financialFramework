/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg.ccard;

import pkg.framework.account.IAccount;
import pkg.framework.customer.ICustomer;
import pkg.framework.factory.Factory;
import pkg.framework.transaction.ITransaction;

/**
 *
 * @author acer
 */
public class CreditCardFactory extends Factory {
   public ITransaction createTransaction(IAccount a, String type, double amount) {
 ITransaction newTransaction=null;
            
            if(type.equalsIgnoreCase("charge"))
                
		return newTransaction=new Charge(a,amount);
            else
                return super.createTransaction(a, type, amount);
   
   
   }

    

    

    @Override
    public IAccount createAccount(ICustomer c, String type) {
        
        if(type.equalsIgnoreCase("gold"))
            return new Gold(c);
        else if(type.equalsIgnoreCase("silver"))
            return new Silver(c);
        else if(type.equalsIgnoreCase("bronze"))
            return new Bronze(c);
         else return super.createAccount( c,  type);
      
       
       
      
        
        
       
       
        
    }  
}
