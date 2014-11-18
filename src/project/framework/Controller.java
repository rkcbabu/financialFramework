package project.framework;

import java.util.List;
import project.framework.account.Account;
import project.framework.account.AccountManager;
import project.framework.account.IAccount;
import project.framework.account.IAccountManager;
import project.framework.customer.CustomerManager;
import project.framework.customer.ICustomer;
import project.framework.customer.ICustomerManager;
import project.framework.factory.IAbstractFactory;
//import project.framework.search.Predicate;
//import project.framework.search.SearchById;
import project.framework.transaction.ITransaction;
import project.framework.transaction.ITransactionManager;
import project.framework.transaction.TransactionManager;

public class Controller implements IController {

    private ITransactionManager transactionServiceManager;
    private IAccountManager accountServiceManager;
    private ICustomerManager customerServiceManager;

    public IAccount findAccount(int id) {
        return accountServiceManager.find(id);
    }
    
     public void setCustomerServiceManager(ICustomerManager icm){
         customerServiceManager=icm;
     }
        public void setTransactionServiceManager(ITransactionManager itm){
            transactionServiceManager=itm;
        }
        public void setAccountServiceManager(IAccountManager iam){
            accountServiceManager=iam;
        }
       

//    public ICustomer findCustomer(int id) {
//        Predicate<Integer> p = new SearchById(id);
//        return this.customerServiceManager.find(id, p);
//    }
//
//  

    public Controller() {
       
       
       
    }

    public void requestTransaction(ITransaction t) {
        transactionServiceManager.request(t);
    }

    public void undoTransaction() {
        transactionServiceManager.undo();
    }

    public void addCustomer(ICustomer c) {
        customerServiceManager.add(c);
    }

    @Override
    public void addAccount(IAccount acc) {
        accountServiceManager.add(acc);
    }

    @Override
    public List<IAccount> getAllAccounts() {
       
        return this.accountServiceManager.getAll();
    }

    @Override
    public ICustomer findCustomer(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
