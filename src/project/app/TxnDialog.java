package project.app;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import project.framework.TransactionActionListener;

public class TxnDialog extends JDialog {

	private String transactionType;
	private int accountNumber;
	private TransactionActionListener actionListener;

	public TxnDialog(TransactionActionListener actionListener,
			String transactionType, int accountNumber) {
		this.transactionType = transactionType;
		this.accountNumber = accountNumber;
		this.actionListener = actionListener;
		// super(parent);
		// parentframe=parent;
		// accnr = aaccnr;

		// This code is automatically generated by Visual Cafe when you add
		// components to the visual environment. It instantiates and initializes
		// the components. To modify the code, only use code syntax that matches
		// what Visual Cafe can generate, or Visual Cafe may be unable to back
		// parse your Java file into its visual environment.

		setTitle(transactionType);
		setModal(true);
		getContentPane().setLayout(null);
		setSize(500, 200);
		setVisible(false);
		JLabel1.setText("Acc Nr");
		getContentPane().add(JLabel1);
		JLabel1.setForeground(java.awt.Color.black);
		JLabel1.setBounds(12, 12, 48, 24);
		JLabel2.setText("Amount");
		getContentPane().add(JLabel2);
		JLabel2.setForeground(java.awt.Color.black);
		JLabel2.setBounds(12, 36, 48, 24);
		JTextField_NAME.setEditable(false);

		getContentPane().add(JTextField_NAME);
		JTextField_NAME.setBounds(84, 12, 156, 20);
		getContentPane().add(JTextField_AMT);
		JTextField_AMT.setBounds(84, 36, 156, 20);
		JButton_OK.setText("OK");
		JButton_OK.setActionCommand("OK");
		getContentPane().add(JButton_OK);
		JButton_OK.setBounds(48, 60, 84, 24);
		JButton_Calcel.setText("Cancel");
		JButton_Calcel.setActionCommand("Cancel");
		getContentPane().add(JButton_Calcel);
		JButton_Calcel.setBounds(156, 60, 84, 24);

		JTextField_NAME.setText(accountNumber + "");

		SymAction lSymAction = new SymAction();
		JButton_OK.addActionListener(lSymAction);
		JButton_Calcel.addActionListener(lSymAction);

	}

	javax.swing.JLabel JLabel1 = new javax.swing.JLabel();
	javax.swing.JLabel JLabel2 = new javax.swing.JLabel();
	javax.swing.JTextField JTextField_NAME = new javax.swing.JTextField();
	javax.swing.JTextField JTextField_AMT = new javax.swing.JTextField();
	javax.swing.JButton JButton_OK = new javax.swing.JButton();
	javax.swing.JButton JButton_Calcel = new javax.swing.JButton();

	class SymAction implements java.awt.event.ActionListener {
		@Override
		public void actionPerformed(java.awt.event.ActionEvent event) {
			Object object = event.getSource();
			if (object == JButton_OK)
				JButtonOK_actionPerformed(event);
			else if (object == JButton_Calcel)
				JButtonCalcel_actionPerformed(event);
		}
	}

	void JButtonOK_actionPerformed(java.awt.event.ActionEvent event) {
		// parentframe.amountDeposit=JTextField_AMT.getText();
		try {
			TxnModel trForm = new TxnModel();
			trForm.setAmount(Double.parseDouble(JTextField_AMT.getText()));
			trForm.setTransactionType(transactionType);
			trForm.setName(JTextField_NAME.getText());
			actionListener.transactionPerformed(trForm);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Please enter valid amount.");
		}
		dispose();
	}

	void JButtonCalcel_actionPerformed(java.awt.event.ActionEvent event) {
		dispose();
	}
}