package project.framework;

import project.framework.account.AccountManager;
import project.framework.account.IAccount;
import project.framework.account.IAccountManager;
import project.framework.customer.CustomerManager;
import project.framework.customer.ICustomer;
import project.framework.customer.ICustomerManager;
import project.framework.transaction.ITransaction;
import project.framework.transaction.ITransactionManager;
import project.framework.transaction.TransactionManager;

public class Controller implements IController {

    private ITransactionManager transactionManager;
    private IAccountManager accountManager;
    private ICustomerManager customerManager;

    public void setTransactionManager(ITransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public void setAccountManager(IAccountManager accountManager) {
        this.accountManager = accountManager;
    }

    public void setCustomerManager(ICustomerManager customerManager) {
        this.customerManager = customerManager;
    }

    public Controller() {
        transactionManager = new TransactionManager();
        accountManager = new AccountManager();
        customerManager = new CustomerManager();
    }

    public void requestTransaction(ITransaction t) {
        transactionManager.request(t);
    }

    public void undoTransaction() {
        transactionManager.undo();
    }

    public void addCustomer(ICustomer c) {
        customerManager.add(c);
    }

    @Override
    public void addAccount(IAccount acc) {
        accountManager.add(acc);
    }
}
