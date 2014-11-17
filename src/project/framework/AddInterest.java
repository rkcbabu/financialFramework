package project.framework;

public abstract class AddInterest extends ATransaction implements ITransaction {

	private CreditCardAccount creditCardAccount;

	private Saving saving;

	public abstract void execute();

	public abstract void undo();

}
