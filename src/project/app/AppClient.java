package project.app;

import project.framework.factory.DefaultUIFactory;
import project.framework.factory.Factory;
import project.framework.customer.CustomerManager;
import project.framework.account.AccountManager;
import project.framework.Controller;
import project.framework.FrameworkClient;
import project.framework.ui.MainView;
import project.framework.UIController;

public class AppClient extends FrameworkClient {

    public static void main(String[] args) {
        MainView mainView = new AppMainView("Financial Application",
                new DefaultUIFactory());

        FrameworkClient appClient = new AppClient()
                .setCustomerManager(new CustomerManager())
                .setTransactionManager(new TransactionManager())
                .setAccountManager(new AccountManager())
                .setMyFactory(new Factory())
                .setController(new Controller())
                .setMainView(mainView)
                .setUiController(new UIController(mainView, new AppFormDialogFactory()));
        appClient.init();
    }

}
