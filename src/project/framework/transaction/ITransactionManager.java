package project.framework.transaction;


import project.ccard.ReportComputer;
import project.framework.account.IAccount;
import project.framework.reporting.Report;

public interface ITransactionManager {

	public void save(ITransaction transaction);
	public void doTransaction(ITransaction transaction);
	public void computeReport(IAccount account,ReportComputer reportComputer);
	public Report getReport();
}
