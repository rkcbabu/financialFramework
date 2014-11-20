package project.framework.factory;

import project.framework.ui.AbstractDynamicPanel;
import javax.swing.JButton;

public interface IUIFactory {

    public AbstractDynamicPanel createCRPanel();

    public AbstractDynamicPanel createTRPanel();

    public JButton createReportButton();

}
