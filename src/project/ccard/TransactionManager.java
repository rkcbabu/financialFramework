package project.ccard;

import project.bank.*;
import java.util.ArrayList;
import java.util.List;


//import creditcard.ReportComputer;
import project.framework.transaction.ATransactionManager;
import project.framework.transaction.Transaction;
import project.framework.reporting.Report;
import project.framework.transaction.ITransaction;

public class TransactionManager extends ATransactionManager{
	private List<ITransaction> transactions = new ArrayList<ITransaction>();

	

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
	public void save(ITransaction transaction){
            transactions.add(transaction);
        }

    

}
