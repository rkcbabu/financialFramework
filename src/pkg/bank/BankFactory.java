/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg.bank;

import java.util.HashMap;
import pkg.framework.account.Account;
import pkg.framework.account.IAccount;
import pkg.framework.customer.ICustomer;
import pkg.framework.customer.Organization;
import pkg.framework.customer.Person;
import pkg.framework.factory.AAbstractFactory;
import pkg.framework.factory.Factory;

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
