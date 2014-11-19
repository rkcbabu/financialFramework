/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg.ccard;

import pkg.framework.account.AAccount;
import pkg.framework.customer.ICustomer;
import pkg.framework.customer.IOrganization;

/**
 *
 * @author acer
 */
public  class creditCardAccount extends AAccount{
    protected double montlyInterest;
    protected double minimumPayment;

   
    public creditCardAccount(ICustomer cus){
        super(cus);
    }
    
    public void charge(double amount){
        withdraw(amount);
         if(amount>400.00)
            this.getCustomer().sendEmail();
       
        
        if(this.getCustomer().getType()=="organization")
            this.getCustomer().sendEmail();
        
        if(this.getCustomer().getType()=="person" && (amount>400 || getBalance()<0))
            this.getCustomer().sendEmail();
        
    }
    public void deposit(double amount){
        if(this.getCustomer().getType()=="organization")
            this.getCustomer().sendEmail();
       
        super.deposit(amount);
         if(this.getCustomer().getType()=="person" && (amount>400 || getBalance()<0))
            this.getCustomer().sendEmail();
    }

    @Override
    public void addInterest() {

     if(montlyInterest>=0.0)
        balance=(1+montlyInterest)*balance;
    
    }
   
    public void sendEmail(){
        
    }
    
   
   
}
