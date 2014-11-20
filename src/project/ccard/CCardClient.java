package project.ccard;

import project.bank.*;
import project.framework.Controller;
import project.framework.factory.IAbstractFactory;
import project.framework.account.IAccountManager;
import project.framework.customer.ICustomerManager;
import project.framework.transaction.ITransactionManager;
import project.framework.ui.MainView;
import project.framework.UIController;

public class CCardClient {

    public static void main(String[] args) {
        ICustomerManager customerManager = new CCardCustomerManager();
        ITransactionManager transactionManager = new CCardTransactionManager();
        IAccountManager accountManager = new CCardAccountManager();
        IAbstractFactory myFactory = new CCardFactory();

        Controller controller = new Controller();

        MainView mainView = new CCardMainView("Credit Card Application",
                new CCardUIFactory());
        UIController uiController = new UIController(mainView,
                new CCardFormFactory());
        controller.setAccountServiceManager(accountManager);
        controller.setCustomerServiceManager(customerManager);
        controller.setTransactionServiceManager(transactionManager);
        controller.setCreationServiceManager(myFactory);
        controller.setUIServiceController(uiController);
        mainView.setVisible(true);
    }

}
