package project.framework;

import project.framework.transaction.ITransaction;

public abstract class Charge  implements ITransaction {

	private CreditCardAccount creditCardAccount;

	public abstract void execute();

	public abstract void undo();

}
