package project.ccard;

import project.framework.FrameworkClient;
import project.framework.Controller;
import project.framework.ui.MainView;
import project.framework.UIController;

public class CCardClient extends FrameworkClient {

    public static void main(String[] args) {

        MainView mainView = new CCardMainView("CCard Application", new CCardUIFactory());

        FrameworkClient ccClient = new CCardClient()
                .setCustomerManager(new CCardCustomerManager())
                .setTransactionManager(new CCardTransactionManager())
                .setAccountManager(new CCardAccountManager())
                .setMyFactory(new CCardFactory())
                .setController(new Controller())
                .setMainView(mainView)
                .setUiController(new UIController(mainView, new CCardFormFactory()));
        ccClient.init();
    }

}
