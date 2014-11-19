package project.framework.transaction;

public abstract class ATransactionManager implements ITransactionManager{

	@Override
	public final void doTransaction(ITransaction transaction) {
		transaction.execute();
		save(transaction);
	}
	
}
