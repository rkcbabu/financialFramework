package project.bank;

import javax.swing.JDialog;
import project.framework.RegistrationActionListener;
import project.framework.factory.AbstractCRFactory;


public class BankFormFactory extends AbstractCRFactory {

	public BankFormFactory() {
	}

	@Override
	public JDialog createCRDialog(String type,RegistrationActionListener listener) {
		if (type.equalsIgnoreCase("personal")) {
			return new PersonalDialog(listener);
		} else {
			return new CompanyDialog(listener);
		}
	}

}
