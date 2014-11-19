package pkg.framework.transaction;

import pkg.framework.account.IAccount;

public class Deposit extends ATransaction {

    public Deposit(IAccount a, double amt) {
        super(a, amt);
    }
  

    public void execute() {
        account.deposit(amount);
    }

    @Override
    public void undo() {
        account.withdraw(amount);
    }

    @Override
    public String getType() {
    return "deposit";
    }

}
