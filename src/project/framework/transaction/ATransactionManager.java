package project.framework.transaction;

public abstract class ATransactionManager implements ITransactionManager{

	@Override
	public final void doTransaction(Transaction transaction) {
		transaction.execute();
		save(transaction);
	}
	
}
