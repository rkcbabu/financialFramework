package pkg.framework.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//import finance.view.TRDialog;
//import finance.view.TRModel;
//import framework.view.TypedJButton;

public class TransactionActionListener implements ActionListener {

	private UIController uiController;

	public TransactionActionListener(UIController uiController) {
		this.uiController = uiController;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		AppButton button = (AppButton) e.getSource();
//		if (button.getType().equals("addinterest")) {
//			uiController.addInterest();
//		} else {
//			TRDialog trDialog = new TRDialog(this, button.getType(),
//					uiController.getAccountNumber());
//			trDialog.setBounds(430, 15, 275, 140);
//			trDialog.show();
//		}
	}

	public void transactionPerformed(TRModel trModel) {
		uiController.transactionPerformed(trModel);
	}
}
