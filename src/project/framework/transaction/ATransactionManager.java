package project.framework.transaction;

public abstract class ATransactionManager implements ITransactionManager{

	@Override
	public final void addTransactionTemplate(Transaction transaction) {
		transaction.execute();
		addTransaction(transaction);
	}
	
}
