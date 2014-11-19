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
public class Silver extends creditCardAccount{
    
    public Silver(ICustomer cus){
        super(cus);
       montlyInterest=0.08;
     minimumPayment=0.12;
    }

        public void monthlyBill() {

        System.out.println("monthly bill for silver account");
          
    }
    
    
   
    }
