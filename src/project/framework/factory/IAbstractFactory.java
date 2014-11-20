package project.framework.factory;

import project.framework.account.IAccountManager;
import project.framework.account.IAccount;
import java.util.List;
import project.framework.FormModel;

import project.framework.customer.ACustomer;
import project.framework.customer.ICustomer;
import project.framework.customer.ICustomerManager;
import project.framework.ICellData;
import project.framework.transaction.ITransactionManager;
import project.framework.reporting.IReportComputer;
import project.framework.transaction.ITransaction;

public interface IAbstractFactory {

    public IReportComputer getReportComputer();

    public ITransaction getTransaction(IAccount account, double amount, String type);

    public ITransaction createTransaction(IAccount account, double amount, String type);

    public ICustomer createCustomer(FormModel form, String customerType);

    public void createCustomer(FormModel form, String customerType, String accountType);

    public IAccount createAccount(FormModel form, ICustomer customer, String accountType);

    public List<ICellData> getDataSet(ICustomerManager customerManager);

    public void setManagers(ICustomerManager customerManager, IAccountManager accountManager, ITransactionManager transactionManager);

    public void createInterestTransactions(List<IAccount> account);

}
