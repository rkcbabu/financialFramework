/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ccard;

import project.framework.account.Account;
import project.framework.customer.ICustomer;
import project.framework.customer.IOrganization;

/**
 *
 * @author acer
 */
public class Bronze extends creditCardAccount{
    
    public Bronze(ICustomer cus){
        super(cus);
       montlyInterest=0.10;
     minimumPayment=0.14;
    }

        public void monthlyBill() {

        System.out.println("monthly bill for gold account");
          
    }
    
    
   
    }
