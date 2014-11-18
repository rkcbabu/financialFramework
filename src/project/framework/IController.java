package project.framework;

import java.util.List;
import project.framework.account.Account;
import project.framework.account.IAccount;
import project.framework.customer.ICustomer;
import project.framework.transaction.ITransaction;

public interface IController {
	public  void requestTransaction(ITransaction t);
	public  void undoTransaction();
	public  void addCustomer(ICustomer c);
        public void addAccount(IAccount acc);
        public List<Account> getAllAccounts();
        public IAccount findAccount(int id);
        public ICustomer findCustomer(int id);
        
        
}
