package project.app;

import project.framework.factory.DefaultUIFactory;
import javax.swing.*;

import project.framework.factory.IUIFactory;
import project.framework.ui.MainView;
import project.framework.UIController;

/**
 * A basic JFC based application.
 */
public class AppMainView extends MainView {

    private JTable table;

    public AppMainView(String title, IUIFactory iuiFactory) {
        super(title, iuiFactory);

    }

    /**
     * ***************************************************
     * The entry point for this application. Sets the Look and Feel to the
     * System Look and Feel. Creates a new JFrame1 and makes it visible.
	 ****************************************************
     */
    static public void main(String args[]) {
        try {
			// Add the following code if you want the Look and Feel
            // to be set to the Look and Feel of the native system.

            try {
                UIManager.setLookAndFeel(UIManager
                        .getSystemLookAndFeelClassName());
            } catch (Exception e) {
            }

			// Create a new instance of our application's frame, and make it
            // visible.
            AppMainView mainView = new AppMainView(
                    "Finance Application", new DefaultUIFactory());
            mainView.setVisible(true);
            new UIController(mainView, new AppFormDialogFactory());
        } catch (Throwable t) {
            t.printStackTrace();
            // Ensure the application exits with an error condition.
            System.exit(1);
        }
    }

    javax.swing.JPanel JPanel1 = new javax.swing.JPanel();
    javax.swing.JButton JButton_PerAC = new javax.swing.JButton();
    javax.swing.JButton JButton_CompAC = new javax.swing.JButton();
    javax.swing.JButton JButton_Deposit = new javax.swing.JButton();
    javax.swing.JButton JButton_Withdraw = new javax.swing.JButton();
    javax.swing.JButton JButton_Addinterest = new javax.swing.JButton();
    javax.swing.JButton JButton_Exit = new javax.swing.JButton();

    void exitApplication() {
        try {
            this.setVisible(false); // hide the Frame
            this.dispose(); // free the system resources
            System.exit(0); // close the application
        } catch (Exception e) {
        }
    }

    class SymWindow extends java.awt.event.WindowAdapter {

        @Override
        public void windowClosing(java.awt.event.WindowEvent event) {
            Object object = event.getSource();
            if (object == AppMainView.this) {
                BankFrm_windowClosing(event);
            }
        }
    }

    void BankFrm_windowClosing(java.awt.event.WindowEvent event) {
        // to do: code goes here.

        BankFrm_windowClosing_Interaction1(event);
    }

    void BankFrm_windowClosing_Interaction1(java.awt.event.WindowEvent event) {
        try {
            this.exitApplication();
        } catch (Exception e) {
        }
    }

}
