package project.framework;

import java.util.List;
import project.framework.account.IAccount;
import project.framework.account.IAccountManager;
import project.framework.customer.ICustomer;
import project.framework.customer.ICustomerManager;
import project.framework.factory.IAbstractFactory;
import project.framework.transaction.ITransaction;
import project.framework.transaction.ITransactionManager;

public interface IController {
        public void setCustomerServiceManager(ICustomerManager icm);
        
        public void setTransactionServiceManager(ITransactionManager itm);
        public void setAccountServiceManager(IAccountManager iam);
       
	public  void requestTransaction(ITransaction t);
	public  void undoTransaction();
	public  void addCustomer(ICustomer c);
        public void addAccount(IAccount acc);
        public void addInterest();
        public List<IAccount> getAllAccounts();
        public IAccount findAccount(int id);
        public ICustomer findCustomer(int id);
}
