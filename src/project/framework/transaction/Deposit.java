package project.framework.transaction;

import project.framework.transaction.Transaction;
import project.framework.account.IAccount;

public class Deposit extends Transaction {

    public Deposit(IAccount account, Double amount, String name) {
        super(account, amount, name);
    }

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return "Deposit";
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        super.execute();
        account.setChanged();
    }

}
