package project.ccard;

import javax.swing.JDialog;
import project.framework.RegistrationActionListener;
import project.framework.factory.AbstractCRFactory;

public class CCardFormFactory extends AbstractCRFactory {

    public CCardFormFactory() {
    }

    @Override
    public JDialog createCRDialog(String type, RegistrationActionListener listener) {
        return new CCardFormDialog(listener);
    }

}
