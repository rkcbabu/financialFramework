package project.bank;

import project.framework.Controller;
import project.framework.FrameworkClient;
import project.framework.ui.MainView;
import project.framework.UIController;

public class BankClient extends FrameworkClient {

    public static void main(String[] args) {
        MainView mainView = new BankMainView("Bank Application",
                new BankUIFactory());

        FrameworkClient bClient = new BankClient()
                .setCustomerManager(new BankCustomerManager())
                .setTransactionManager(new BankTransactionManager())
                .setAccountManager(new BankAccountManager())
                .setMyFactory(new BankFactory())
                .setController(new Controller())
                .setMainView(mainView)
                .setUiController(new UIController(mainView, new BankFormFactory()));
        bClient.init();
    }

}
