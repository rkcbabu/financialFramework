package project.app;

import java.util.ArrayList;
import java.util.List;
import project.ccard.ReportComputer;
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
    public void computeReport(IAccount account, ReportComputer reportComputer) {
		// TODO Auto-generated method stub

    }

    @Override
    public Report getReport() {
        // TODO Auto-generated method stub
        return null;
    }

}
