package project.framework.transaction;

import java.util.Vector;
import project.framework.IAccount;

public class ATransactionManager implements ITransactionManager {

    protected Vector<ITransaction> transactionList = new Vector();

    public void generateReport() {

    }

    /**
     * @see ITransactionManager#save()
     *
     */
    public void save(ITransaction t) {
        transactionList.add(t);
    }

    /**
     * @see ITransactionManager#request()
     */
    public void request(ITransaction t) {
        t.execute();
        save(t);
    }

    /**
     * @see ITransactionManager#undo()
     *
     *
     */
    public void undo() {

    }

}
