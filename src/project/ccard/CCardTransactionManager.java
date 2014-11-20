package project.ccard;

import java.util.ArrayList;
import java.util.List;
import project.framework.account.IAccount;
import project.framework.reporting.Report;
import project.framework.transaction.ATransactionManager;
import project.framework.transaction.ITransaction;
import project.framework.transaction.Transaction;

public class CCardTransactionManager extends ATransactionManager {

    private List<ITransaction> transactions = new ArrayList<ITransaction>();

//	@Override
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    @Override
    public void computeReport(IAccount account, ReportComputer reportComputer) {
        Report report = new Report(null);
        for (ITransaction t : transactions) {
            if (t.getAccount() == account) {
                reportComputer.compute(t);
                report.addChildReport(reportComputer.getReport());
            }
        }
    }

    @Override
    public Report getReport() {
        return null;
    }

    @Override
    public void save(ITransaction transaction) {
        transactions.add(transaction);
    }

}
