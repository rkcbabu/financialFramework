package pkg.bank.common.views;

import javax.swing.*;
//import project.framework.views.MainView;


//import framework.view.IUIFactory;
//import framework.view.MainView;
//import framework.view.controller.UIController;

/**
 * A basic JFC based application.
 */
public class DefaultMainView extends MainView {
	private JTable table;

	public DefaultMainView(String title) {//, IUIFactory iuiFactory
		super(title); //, iuiFactory

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
			if (object == DefaultMainView.this)
				BankFrm_windowClosing(event);
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
