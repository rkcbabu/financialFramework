package pkg.framework;

//import project.bank.common.views.DefaultMainView;
import pkg.framework.account.AccountManager;
import pkg.framework.customer.CustomerManager;
import pkg.framework.transaction.TransactionManager;
import pkg.framework.ui.DefaultMainView;
import pkg.framework.ui.DefaultUIFactory;
import pkg.framework.ui.MainView;

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
