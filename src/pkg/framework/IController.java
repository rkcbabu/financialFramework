package pkg.framework;

import java.util.HashMap;
import java.util.List;
import pkg.framework.account.IAccount;
import pkg.framework.account.IAccountManager;
import pkg.framework.customer.ICustomer;
import pkg.framework.customer.ICustomerManager;
import pkg.framework.factory.IAbstractFactory;
import pkg.framework.transaction.ITransaction;
import pkg.framework.transaction.ITransactionManager;

public interface IController {
        public void setCustomerServiceManager(ICustomerManager icm);
        
        public void setTransactionServiceManager(ITransactionManager itm);
        public void setAccountServiceManager(IAccountManager iam);
        public void setCreationServiceManager(IAbstractFactory iaf);
        public void setUIServiceManager(IUImanager iui);

	public  void requestTransaction(ITransaction t);
	public  void undoTransaction();
	public  void addCustomer(ICustomer c);
        public void addAccount(IAccount acc);
        public void addInterest();
        public List<IAccount> getAllAccounts();
        public IAccount findAccount(int id);
        public ICustomer findCustomer(int id);
        public ITransaction createTransaction(int accId,  String type,double amount);
        public   ICustomer createCustomer(HashMap data, String type);
	public  IAccount createAccount(ICustomer c, String type);

        
}
