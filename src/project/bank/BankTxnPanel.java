package project.bank;

import javax.swing.BoxLayout;

import project.framework.ui.AbstractDynamicPanel;
import project.framework.ui.AppButton;

public class BankTxnPanel extends AbstractDynamicPanel {

	public BankTxnPanel() {
//		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
//		AppButton button = new AppButton("Deposit", "deposit");
//		AppButton withdraw = new AppButton("Withdraw", "withdraw");
//		this.addButton(button);
//		this.addButton(withdraw);
            this.addButton(new AppButton("Add interest","addinterest"));
	}
}
