package project.framework;

//import project.bank.common.views.DefaultMainView;
import project.framework.account.AccountManager;
import project.framework.customer.CustomerManager;
import project.framework.transaction.TransactionManager;
import project.framework.ui.DefaultMainView;
import project.framework.ui.DefaultUIFactory;
import project.framework.ui.MainView;

//import project.bank.common.views.MainView;
//import project.bank.common.views.DefaultMainView;
//import project.framework.account.AccountManager;
//import project.framework.customer.CustomerManager;
//import project.framework.transaction.TransactionManager;
//import project.framework.views.MainView;
public class Application {

//	private Bank bank;
    public static void main(String[] arg) {
        System.out.println("Framework started");
        start();
    }

    public static void start() {
        Controller controller = new Controller();
        //injections
        controller.setCustomerManager(new CustomerManager());
        controller.setAccountManager(new AccountManager());
        controller.setTransactionManager(new TransactionManager());

        MainView mv = new DefaultMainView("framework default", new DefaultUIFactory());
        
//        UIController uiController = new UIController(mainView,
//                new DefaultCRDialogFactory());
//
//        controller.setUIController(uiController);

       
        
        
        mv.setVisible(true);
    }

}
