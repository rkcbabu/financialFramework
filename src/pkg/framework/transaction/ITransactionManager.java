package pkg.framework.transaction;

public interface ITransactionManager {

//	private ITransactionHistory iTransactionHistory;
//
//	private ITransaction iTransaction;
    public abstract void save(ITransaction t);

    public abstract void request(ITransaction t);

    public abstract void undo();

    public abstract void generateReport();

}
