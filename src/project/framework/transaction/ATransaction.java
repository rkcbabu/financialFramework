package project.framework.transaction;

import java.util.Date;
import project.framework.account.IAccount;

public class ATransaction implements ITransaction {

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
    public void execute() {
        // override this
    }

    /**
     * @see ITransaction#undo()
     */
    public void undo() {

    }

}
