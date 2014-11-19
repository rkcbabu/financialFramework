package project.framework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import project.framework.factory.AbstractCRFactory;
import project.framework.ui.AppButton;

public class RegistrationActionListener implements ActionListener {

	private UIController uiController;
	private AbstractCRFactory dialogFactory;

	public RegistrationActionListener(UIController uiController,
			AbstractCRFactory dialogFactory) {
		this.uiController = uiController;
		this.dialogFactory = dialogFactory;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		AppButton typedButton = (AppButton) e.getSource();
		dialogFactory.createCRDialog(typedButton.getType(),this).show();
	}

	public void registerCustomer(FormModel crModel) {
		uiController.registerCustomer(crModel);
	}

}
