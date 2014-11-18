package project.framework.transaction;

//import project.framework.CreditCardAccount;
import project.framework.account.IAccount;
import project.framework.account.Saving;
import project.framework.transaction.ITransaction;
import project.framework.transaction.ATransaction;

public abstract class AddInterest extends ATransaction implements ITransaction {

//	private CreditCardAccount creditCardAccount;
    private Saving saving;

    public AddInterest(IAccount a, double amt) {
        super(a, amt);
    }

    public abstract void execute();

    public abstract void undo();

}
