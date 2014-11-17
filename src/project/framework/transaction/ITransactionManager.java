package project.framework.transaction;

public interface ITransactionManager {

//	private ITransactionHistory iTransactionHistory;
//
//	private ITransaction iTransaction;

	public abstract void save();

	public abstract void request();

	public abstract void undo();

	public abstract void generateReport();

}
