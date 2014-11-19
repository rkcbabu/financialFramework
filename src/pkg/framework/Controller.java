package pkg.framework;

import java.util.HashMap;
import java.util.List;
import pkg.framework.account.IAccount;
import pkg.framework.account.IAccountManager;
import pkg.framework.customer.ICustomer;
import pkg.framework.customer.ICustomerManager;
import pkg.framework.factory.IAbstractFactory;
//import project.framework.search.Predicate;
//import project.framework.search.SearchById;
import pkg.framework.transaction.ITransaction;
import pkg.framework.transaction.ITransactionManager;
import pkg.framework.ui.Report;

public class Controller implements IController {

    private ITransactionManager transactionServiceManager;
    private IAccountManager accountServiceManager;
    private ICustomerManager customerServiceManager;
    private IAbstractFactory creationServiceManager;
        private IUImanager uiServiceManager;

            public void setUIServiceManager(IUImanager iui){
                uiServiceManager=iui;
            }


    public ITransaction createTransaction(int accId, String type, double amount) {

        IAccount acc=this.accountServiceManager.find(accId);
        return creationServiceManager.createTransaction(acc, type, amount);
    }

    public IAccount findAccount(int id) {
        return accountServiceManager.find(id);
    }

    public void addInterest() {
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

    public void setCreationServiceManager(IAbstractFactory iaf) {
        creationServiceManager = iaf;
    }

    public ITransactionManager getTransactionServiceManager() {
        return transactionServiceManager;
    }

    public Controller() {
    }

    public ICustomer createCustomer(HashMap data, String type) {
        return this.creationServiceManager.createCustomer(data,type);
    }

    public IAccount createAccount(ICustomer c, String type) {
        return this.creationServiceManager.createAccount(c,type);
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
    public void executeTransaction(ITransaction tran) {
        this.transactionServiceManager.request(tran);
    }

    public Report getReport() {
        return customerServiceManager.getReport();
    }
}