package project.bank;

import java.util.ArrayList;
import java.util.List;
import project.framework.account.IAccount;
import project.framework.reporting.Report;
import project.framework.transaction.Transaction;



public class BankTransactionManager extends TransactionManager{
	private List<Transaction> transactions = new ArrayList<Transaction>();

//	@Override
	public void addTransaction(Transaction transaction){
		transactions.add(transaction);
	}

//	@Override
	public void computeReport(IAccount account,ReportComputer reportComputer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Report getReport() {
		// TODO Auto-generated method stub
		return null;
	}

}
