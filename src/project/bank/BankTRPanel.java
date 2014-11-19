package project.bank;

import project.app.AppTxnPanel;
import project.framework.ui.AppButton;



public class BankTRPanel extends AppTxnPanel {

	public BankTRPanel() {
		this.addButton(new AppButton("Add interest","addinterest"));
	}
}
