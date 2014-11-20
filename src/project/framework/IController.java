package project.framework;

import java.util.HashMap;
import java.util.List;

import project.framework.account.IAccount;
import project.framework.account.IAccountManager;
import project.framework.customer.ICustomerManager;
import project.framework.factory.IAbstractFactory;
import project.framework.reporting.Report;
import project.framework.transaction.ITransactionManager;

public interface IController {

    public void setCustomerServiceManager(ICustomerManager icm);

    public void setTransactionServiceManager(ITransactionManager itm);

    public void setAccountServiceManager(IAccountManager iam);

    public void setCreationServiceManager(IAbstractFactory iaf);

    public void setUIServiceController(UIController iui);

    public boolean executeTransaction(int accId, double amount, String type);

    public boolean createCustomer(FormModel form, String customerType, String accountType);

    public Report getReport();

    public void addInterest();

}
