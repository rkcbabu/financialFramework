package project.framework;

import project.framework.factory.IAbstractFactory;
import project.framework.account.IAccountManager;
import project.framework.customer.ICustomerManager;
import project.framework.transaction.ITransactionManager;
import project.framework.ui.MainView;

public class FrameworkClient {

    ICustomerManager customerManager;
    ITransactionManager transactionManager;
    IAccountManager accountManager;
    IAbstractFactory myFactory;
    Controller controller;
    MainView mainView;
    UIController uiController;

    public void init() {
        if (customerManager != null
                && transactionManager != null
                && accountManager != null
                && myFactory != null
                && controller != null
                && mainView != null
                && uiController != null) {
            controller.setAccountServiceManager(accountManager);
            controller.setCustomerServiceManager(customerManager);
            controller.setTransactionServiceManager(transactionManager);
            controller.setCreationServiceManager(myFactory);
            controller.setUIServiceController(uiController);
            mainView.setVisible(true);
        } else {
            System.err.println("Services are not initialized.");
        }
    }

    public FrameworkClient setCustomerManager(ICustomerManager customerManager) {
        this.customerManager = customerManager;
        return this;
    }

    public FrameworkClient setTransactionManager(ITransactionManager transactionManager) {
        this.transactionManager = transactionManager;
        return this;
    }

    public FrameworkClient setAccountManager(IAccountManager accountManager) {
        this.accountManager = accountManager;
        return this;
    }

    public FrameworkClient setMyFactory(IAbstractFactory myFactory) {
        this.myFactory = myFactory;
        return this;
    }

    public FrameworkClient setController(Controller controller) {
        this.controller = controller;
        return this;
    }

    public FrameworkClient setMainView(MainView mainView) {
        this.mainView = mainView;
        return this;
    }

    public FrameworkClient setUiController(UIController uiController) {
        this.uiController = uiController;
        return this;
    }

}
