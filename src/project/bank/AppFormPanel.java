package project.bank;

import project.framework.ui.AbstractDynamicPanel;
import project.framework.ui.AppButton;

public class AppFormPanel extends AbstractDynamicPanel {

	public AppFormPanel() {
		AppButton button = new AppButton("Add customer","addcustomer");
		this.add(button);
		this.addButton(button);
	}
}
