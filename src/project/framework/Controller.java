package project.framework;

import java.util.List;
import project.framework.account.Account;
import project.framework.account.AccountManager;
import project.framework.account.IAccount;
import project.framework.account.IAccountManager;
import project.framework.customer.CustomerManager;
import project.framework.customer.ICustomer;
import project.framework.customer.ICustomerManager;
import project.framework.search.Predicate;
import project.framework.search.SearchById;
import project.framework.transaction.ITransaction;
import project.framework.transaction.ITransactionManager;
import project.framework.transaction.TransactionManager;

public class Controller implements IController {

    private ITransactionManager transactionManager;
    private IAccountManager accountManager;
    private ICustomerManager customerManager;

    public IAccount findAccount(int id) {
        return accountManager.find(id);
    }

    public ICustomer findCustomer(int id) {
        Predicate<Integer> p = new SearchById(id);
        return this.customerManager.find(id, p);
    }

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

    public List<Account> getAllAccounts() {
        return this.accountManager.getAll();
    }
}
