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

/**
 *
 * @author Prakash
 */
public class BankFactory extends AAbstractFactory {

    @Override
    public ICustomer createCustomer(HashMap data) {
        String type = "Person";

        if (type == "Person") {
            return new Person(data);
        } else if (type == "Organization") {
            return new Organization(data);
        } else {
            return null;
        }
    }

    @Override
    public IAccount createAccount(ICustomer c) {
        String type = "Checking";
        if (type == "Checking") {
            return new Checking(c);
        } else if (type == "Saving") {
            return new Saving(c);
        } else {
            return null;
        }
    }

}
