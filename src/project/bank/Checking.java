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
public class Checking extends AAccount{

    public Checking(ICustomer cus) {
        super(cus);
    }
    
}
