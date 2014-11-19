package project.app;

import javax.swing.JDialog;


import project.framework.factory.AbstractCRFactory;
import project.framework.RegistrationActionListener;

public class DefaultCRDialogFactory extends AbstractCRFactory {

	public DefaultCRDialogFactory() {
		super();
	}

	@Override
	public JDialog createCRDialog(String type,RegistrationActionListener listener) {
		JDialog crDialog = new FormDialog(listener);
		crDialog.setBounds(450, 20, 300, 330);
		return crDialog;
	}

}
