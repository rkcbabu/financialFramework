package pkg.framework.transaction;

import pkg.framework.account.IAccount;

public class Withdraw extends ATransaction {

    public Withdraw(IAccount a, double amt) {
        super(a, amt);
    }

    public void execute() {
        account.withdraw(amount);
    }

    @Override
    public void undo() {
        account.deposit(amount);
    }
 @Override
    public String getType() {
    return "withdraw";
    }

}
