package project.framework.account;






import project.framework.transaction.Transaction;
import project.framework.customer.ICustomer;
import project.framework.transaction.ITransactionManager;
import project.framework.reporting.Report;

public interface IAccount {
	public void setManagers(IAccountManager accountManger,ITransactionManager transactionManager);
	
	public void addBalance(double amount);
	public int getId(); 
	public double getCurrentBalance();
	public ICustomer getCustomer();
	public void notifyCustomer(Transaction transaction);
	public void setChanged();
	public  String getType();
	public Report getReport();
	public String getExpiryDate();
	
	public double computeInterest();
	
}
