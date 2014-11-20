package project.bank;

import java.util.ArrayList;
import java.util.List;
import project.framework.account.IAccount;
import project.framework.transaction.ATransactionManager;
import project.framework.reporting.Report;
import project.framework.transaction.ITransaction;

public class TransactionManager extends ATransactionManager {

    private List<ITransaction> transactions = new ArrayList<ITransaction>();

    @Override
    public void save(ITransaction transaction) {
        transactions.add(transaction);
    }

    @Override
    public Report getReport() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void computeReport(IAccount account, project.ccard.ReportComputer reportComputer) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

}
