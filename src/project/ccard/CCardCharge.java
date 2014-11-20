package project.ccard;

import project.framework.account.IAccount;
import project.framework.transaction.Transaction;

public class CCardCharge extends Transaction {

    public CCardCharge(IAccount account, Double amount, String name) {
        super(account, -amount, name);
    }

    @Override
    public String getType() {
        return "Charge";
    }

    @Override
    public void execute() {
        super.execute();
        account.setChanged();
    }
}
