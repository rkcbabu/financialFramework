package project.app;

import project.framework.factory.DefaultUIFactory;
import project.framework.factory.Factory;
import project.framework.customer.CustomerManager;
import project.framework.account.AccountManager;
import project.framework.Controller;
import project.framework.FormModel;
import project.framework.IController;
import project.framework.factory.IAbstractFactory;
import project.framework.account.IAccountManager;
import project.framework.customer.ICustomerManager;
import project.framework.transaction.ITransactionManager;
import project.framework.ui.MainView;
import project.framework.UIController;

public class Main {

    public static void main(String[] args) {
        // Default
        ICustomerManager customerManager = new CustomerManager();
        ITransactionManager transactionManager = new TransactionManager();
        IAccountManager accountManager = new AccountManager();
        IAbstractFactory myFactory = new Factory();

        MainView mainView = new AppMainView("Financial Application",
                new DefaultUIFactory());
        UIController uiController = new UIController(mainView,
                new AppFormDialogFactory());
        
        IController controller = new Controller();
        controller.setAccountServiceManager(accountManager);
        controller.setCustomerServiceManager(customerManager);
        controller.setTransactionServiceManager(transactionManager);
        controller.setCreationServiceManager(myFactory);
        controller.setUIServiceController(uiController);
        
        mainView.setVisible(true);
    }

    private static FormModel getFormData(String name, String city, String email,
            String state, String street, String zip) {
        FormModel crModel = new FormModel();
        crModel.setName(name);
        crModel.setCity(city);
        crModel.setEmail(email);
        crModel.setState(state);
        crModel.setStreet(street);
        crModel.setZip(zip);
        return crModel;
    }
}
