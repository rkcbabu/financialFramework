package project.bank;

import javax.swing.JDialog;

import project.framework.factory.AbstractCRFactory;
import project.framework.RegistrationActionListener;

public class BankFormDialogFactory extends AbstractCRFactory {

    public BankFormDialogFactory() {
        super();
    }

    @Override
    public JDialog createCRDialog(String type, RegistrationActionListener listener) {
        JDialog crDialog = new FormDialog(listener);
        crDialog.setBounds(450, 20, 300, 330);
        return crDialog;
    }

}
