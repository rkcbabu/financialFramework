/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bank;

import project.framework.account.IAccount;
import project.framework.transaction.ATransaction;

/**
 *
 * @author Prakash
 */
public class AddInterest extends ATransaction {
    
    public AddInterest(IAccount a, double interest) {
        super(a, interest);
    }
    
    @Override
    public void execute() {
        account.deposit(amount);
    }
    
    @Override
    public void undo() {
        account.withdraw(amount);
    }
    
}
