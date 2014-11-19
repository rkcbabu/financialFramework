package project.bank;

import java.util.ArrayList;
import java.util.List;


//import creditcard.ReportComputer;
import project.framework.transaction.ATransactionManager;
import project.framework.transaction.Transaction;
import project.framework.reporting.Report;

public class TransactionManager extends ATransactionManager{
	private List<Transaction> transactions = new ArrayList<Transaction>();

	@Override
	public void save(Transaction transaction){
		transactions.add(transaction);
	}

//	@Override
//	public void computeReport(IAccount account,ReportComputer reportComputer) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public Report getReport() {
		// TODO Auto-generated method stub
		return null;
	}

}
