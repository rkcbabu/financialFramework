package project.framework;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import project.framework.factory.IAbstractFactory;
import project.framework.account.IAccount;
import project.framework.account.IAccountManager;
import project.framework.customer.ICustomerManager;
import project.framework.transaction.ITransactionManager;
import project.framework.reporting.Report;
import project.framework.transaction.ITransaction;

public class Controller implements IController, Observer {

    private IAccountManager accountServiceManager;
    private ICustomerManager customerServiceManager;
    private ITransactionManager transactionServiceManager;
    private IAbstractFactory creationServiceManager;
    private UIController uiController;

    public void setCustomerServiceManager(ICustomerManager icm) {
        this.customerServiceManager = icm;
        icm.setController(this);
    }

    public void setTransactionServiceManager(ITransactionManager itm) {
        this.transactionServiceManager = itm;

    }

    public void setAccountServiceManager(IAccountManager iam) {
        this.accountServiceManager = iam;
        iam.setController(this);
    }

    public void setCreationServiceManager(IAbstractFactory iaf) {
        this.creationServiceManager = iaf;
        iaf.setManagers(customerServiceManager, accountServiceManager, transactionServiceManager);
    }

    public void setUIServiceController(UIController iui) {
        this.uiController = iui;
        iui.setController(this);
    }

    public Controller() {

    }

    public boolean executeTransaction(int accId, double amount, String type) {
        IAccount account = accountServiceManager.find(accId);
        if (account != null) {
            creationServiceManager.createTransaction(account, amount, type);

            return true;
        }
        return false;
    }

    public boolean createCustomer(FormModel form, String customerType, String accountType) {
        creationServiceManager.createCustomer(form, customerType, accountType);
        return true;
    }

    public Report getReport() {
        return customerServiceManager.getReport();
    }

    public void addInterest() {
        List<IAccount> accounts = accountServiceManager.getAll();
        for (IAccount account : accounts) {
            double interest = account.computeInterest();
            System.out.println(interest);
            creationServiceManager.createTransaction(account, interest, "addinterest");
        }
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        // TODO Auto-generated method stub
        List<ICellData> dataSetList = creationServiceManager.getDataSet(customerServiceManager);
        if (uiController == null) {
            System.err.println("uiController is not set");
        } else {
            uiController.updateTable(dataSetList);
        }

    }

}
