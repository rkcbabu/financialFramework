package project.framework.transaction;

import project.framework.IAccount;

public interface ITransactionManager {

//	private ITransactionHistory iTransactionHistory;
//
//	private ITransaction iTransaction;
    public abstract void save(ITransaction t);

    public abstract void request(ITransaction t);

    public abstract void undo();

    public abstract void generateReport();

}
