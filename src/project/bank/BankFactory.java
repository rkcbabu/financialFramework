/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bank;

import java.util.HashMap;
import project.framework.account.Account;
import project.framework.account.IAccount;
import project.framework.customer.ICustomer;
import project.framework.customer.Organization;
import project.framework.customer.Person;
import project.framework.factory.AAbstractFactory;
import project.framework.factory.Factory;

/**
 *
 * @author Prakash
 */
public class BankFactory extends Factory {

   @Override
    public IAccount createAccount(ICustomer c, String type) {
       
        if (type.equalsIgnoreCase("checking")) {
            return new Checking(c);
        } else if (type.equalsIgnoreCase("saving")) {
            return new Saving(c);
        } else {
            return super.createAccount(c, type);
        }
    }

}
