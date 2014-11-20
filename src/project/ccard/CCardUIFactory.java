package project.ccard;

import javax.swing.JButton;
import project.framework.factory.IUIFactory;
import project.framework.ui.AbstractDynamicPanel;

public class CCardUIFactory implements IUIFactory {

    @Override
    public AbstractDynamicPanel createCRPanel() {
        return new CCardFormPanel();
    }

    @Override
    public AbstractDynamicPanel createTRPanel() {
        return new CCardTxnPanel();
    }

    @Override
    public JButton createReportButton() {
        return new JButton("Generate Monthly Bills");
    }

}
