package project.ccard;

import project.bank.*;
import project.framework.ui.AbstractDynamicPanel;
import project.framework.ui.AppButton;

public class CardFormPanel extends AbstractDynamicPanel {

	public CardFormPanel() {
		AppButton button = new AppButton("Add customer","addcustomer");
		this.add(button);
		this.addButton(button);
	}
}
