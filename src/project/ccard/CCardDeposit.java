package project.ccard;

import project.framework.account.IAccount;
import project.framework.transaction.Transaction;

public class CCardDeposit extends Transaction {

    public CCardDeposit(IAccount account, Double amount, String name) {
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
