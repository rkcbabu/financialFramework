package pkg.framework.transaction;

//import project.framework.CreditCardAccount;
import pkg.framework.account.IAccount;
import pkg.framework.account.Saving;
import pkg.framework.transaction.ITransaction;
import pkg.framework.transaction.ATransaction;

public abstract class AddInterest extends ATransaction implements ITransaction {

//	private CreditCardAccount creditCardAccount;
    private Saving saving;

    public AddInterest(IAccount a, double amt) {
        super(a, amt);
    }

    public abstract void execute();

    public abstract void undo();

}
