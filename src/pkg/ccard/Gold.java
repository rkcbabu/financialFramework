/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg.ccard;

import pkg.framework.account.Account;
import pkg.framework.customer.ICustomer;
import pkg.framework.customer.IOrganization;

/**
 *
 * @author acer
 */
public class Gold extends creditCardAccount{
    
    public Gold(ICustomer cus){
        super(cus);
       montlyInterest=0.06;
     minimumPayment=0.10;
    }

        public void monthlyBill() {

        System.out.println("monthly bill for gold account");
          
    }
    
       
    
   
    }
