package project.ccard;

import javax.swing.JButton;
import project.bank.BankTxnPanel;
import project.framework.factory.IUIFactory;
import project.framework.ui.AbstractDynamicPanel;

public class CCardUIFactory implements IUIFactory {

    @Override
    public AbstractDynamicPanel createCRPanel() {
        return new CCardFormPanel();
    }

    @Override
    public AbstractDynamicPanel createTRPanel() {
        return new BankTxnPanel();
    }

    @Override
    public JButton createReportButton() {
        return new JButton("Generate Monthly Bills");
    }

}
