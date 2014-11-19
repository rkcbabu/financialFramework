package project.bank;

import project.framework.Controller;
import project.framework.factory.IAbstractFactory;
import project.framework.account.IAccountManager;
import project.framework.customer.ICustomerManager;
import project.framework.transaction.ITransactionManager;
import project.framework.ui.MainView;
import project.framework.UIController;

public class Main {

    public static void main(String[] args) {
        ICustomerManager customerManager = new BankCustomerManager();
        ITransactionManager transactionManager = new BankTransactionManager();
        IAccountManager accountManager = new BankAccountManager();
        IAbstractFactory myFactory = new BankFactory();

        Controller controller = new Controller();

        MainView mainView = new BankMainView("Bank Application",
                new BankUIFactory());
        UIController uiController = new UIController(mainView,
                new BankFormFactory());
        controller.setAccountServiceManager(accountManager);
        controller.setCustomerServiceManager(customerManager);
        controller.setTransactionServiceManager(transactionManager);
        controller.setCreationServiceManager(myFactory);
        controller.setUIServiceController(uiController);
        mainView.setVisible(true);
    }

}
