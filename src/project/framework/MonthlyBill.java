package project.framework;

public abstract class MonthlyBill  {

	private CreditCardAccount creditCardAccount;

	public abstract void execute();

	public abstract void undo();

}
