/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bank;

import project.framework.account.AAccount;
import project.framework.customer.ICustomer;

/**
 *
 * @author Prakash
 */
public class Saving extends AAccount{

    public Saving(ICustomer cus) {
        super(cus);
    }

    @Override
    public void addInterest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
