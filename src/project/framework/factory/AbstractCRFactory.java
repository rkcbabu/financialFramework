package project.framework.factory;

import javax.swing.JDialog;

import project.framework.RegistrationActionListener;
import project.framework.UIController;

public abstract class AbstractCRFactory {

    protected UIController uiController;

    public AbstractCRFactory() {

    }

    public abstract JDialog createCRDialog(String type, RegistrationActionListener listener);
}
