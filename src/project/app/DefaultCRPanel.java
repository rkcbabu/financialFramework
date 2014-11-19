package project.app;

import project.framework.ui.AbstractDynamicPanel;
import project.framework.ui.AppButton;

public class DefaultCRPanel extends AbstractDynamicPanel {

	public DefaultCRPanel() {
		AppButton button = new AppButton("Add customer","addcustomer");
		this.add(button);
		this.addButton(button);
	}
}
