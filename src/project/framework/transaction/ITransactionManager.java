package project.framework.transaction;


//import creditcard.ReportComputer;
import project.framework.transaction.Transaction;
import project.framework.reporting.Report;

public interface ITransactionManager {

	public void save(Transaction transaction);
	public void doTransaction(Transaction transaction);
//	public void computeReport(IAccount account,ReportComputer reportComputer);
	public Report getReport();
}
