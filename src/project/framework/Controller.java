package project.framework;

import java.util.List;
import project.framework.account.IAccount;
import project.framework.account.IAccountManager;
import project.framework.customer.ICustomer;
import project.framework.customer.ICustomerManager;
import project.framework.factory.IAbstractFactory;
//import project.framework.search.Predicate;
//import project.framework.search.SearchById;
import project.framework.transaction.ITransaction;
import project.framework.transaction.ITransactionManager;
import project.framework.ui.Report;

public class Controller implements IController {

    private ITransactionManager transactionServiceManager;
    private IAccountManager accountServiceManager;
    private ICustomerManager customerServiceManager;
    private IAbstractFactory abstractFactory;
    public IAccount findAccount(int id) {
        return accountServiceManager.find(id);
    }

            public void addInterest(){
                accountServiceManager.addInterest();
            }

    public void setCustomerServiceManager(ICustomerManager icm) {
        customerServiceManager = icm;
    }

    public void setTransactionServiceManager(ITransactionManager itm) {
        transactionServiceManager = itm;
    }

    public void setAccountServiceManager(IAccountManager iam) {
        accountServiceManager = iam;
    }

    public ITransactionManager getTransactionServiceManager() {
        return transactionServiceManager;
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

    public ICustomer findCustomer(int id) {
        return customerServiceManager.find(id);
    }

    public void setTransactionManager(ITransactionManager transactionManager) {
        this.transactionServiceManager = transactionManager;
    }

    public void setAccountManager(IAccountManager accountManager) {
        this.accountServiceManager = accountManager;
    }

    public void setCustomerManager(ICustomerManager customerManager) {
        this.customerServiceManager = customerManager;
    }

//    public void setAbstractFactory(IAbstractFactory abstractFactory) {
//        this.abstractFactory = abstractFactory;
//    }
    public boolean executeTransaction(int accountNumber, double amount, String type) {
        IAccount account = accountServiceManager.find(accountNumber);
        if (account != null) {
            abstractFactory.createTransaction(account, type, amount);
            return true;
        }
        return false;
    }

    public Report getReport() {
        return customerServiceManager.getReport();
    }
}
