package project.app;

import project.framework.factory.DefaultUIFactory;
import project.framework.factory.Factory;
import project.framework.customer.CustomerManager;
import project.framework.account.AccountManager;
import project.framework.Controller;
import project.framework.FormModel;
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

        MainView mainView = new AppMainView("Finance Application",
                new DefaultUIFactory());
        UIController uiController = new UIController(mainView,
                new AppFormDialogFactory());
        
        Controller controller = new Controller(uiController);
        
        controller.injectServiceProviders(customerManager,
                accountManager, transactionManager, myFactory);
        
////        controller.setUIController(uiController);
////        uiController.setController(controller);
//
//        FormModel formData = getFormData("Default", "Fairfield",
//                "default@abc.com", "fairfield", "1000 N", "52556");
//        uiController.registerCustomer(formData);

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
