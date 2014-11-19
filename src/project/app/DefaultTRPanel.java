package project.app;

import javax.swing.BoxLayout;

import project.framework.ui.AbstractDynamicPanel;
import project.framework.ui.AppButton;

public class DefaultTRPanel extends AbstractDynamicPanel {

	public DefaultTRPanel() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		AppButton button = new AppButton("Deposit", "deposit");

		AppButton withdraw = new AppButton("Withdraw", "withdraw");
		this.add(button);
		this.addButton(button);
		this.add(withdraw);
		this.addButton(withdraw);
	}
}
