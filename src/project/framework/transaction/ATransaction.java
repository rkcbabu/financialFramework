package project.framework.transaction;

import java.util.Date;
import project.framework.account.IAccount;

public abstract class ATransaction implements ITransaction {

    protected double amount;
    protected IAccount account;
    protected Date txnDate;

    public ATransaction(IAccount a, double amt) {
        account = a;
        amount = amt;
    }

    /**
     * @see ITransaction#execute()
     */
    public abstract void execute();

    /**
     * @see ITransaction#undo()
     */
    public abstract void undo();

}
