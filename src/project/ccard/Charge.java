/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ccard;

import project.framework.account.IAccount;
import project.framework.transaction.ATransaction;

/**
 *
 * @author acer
 */
public class Charge extends ATransaction {

   public Charge(IAccount a, double amt) {
        super(a, amt);
    }
  

    public void execute() {
        ((creditCardAccount)account).charge(amount);
    }

    @Override
    public void undo() {
        account.deposit(amount);
    }

    @Override
    public String getType() {
    return "deposit";
    }
    
}
