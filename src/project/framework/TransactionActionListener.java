package project.framework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import project.framework.ui.AppButton;

public class TransactionActionListener implements ActionListener {

	private UIController uiController;

	public TransactionActionListener(UIController uiController) {
		this.uiController = uiController;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		AppButton button = (AppButton) e.getSource();
		if (button.getType().equals("addinterest")) {
			uiController.addInterest();
		} else {
			TxnDialog trDialog = new TxnDialog(this, button.getType(),
					uiController.getAccountNumber());
			trDialog.setBounds(430, 15, 275, 140);
			trDialog.show();
		}
	}

	public void transactionPerformed(TxnModel trModel) {
		uiController.transactionPerformed(trModel);
	}
}
