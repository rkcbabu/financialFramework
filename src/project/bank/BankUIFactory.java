package project.bank;

import project.framework.factory.*;
import javax.swing.JButton;

import project.framework.ui.AbstractDynamicPanel;

public class BankUIFactory implements IUIFactory {

    @Override
    public AbstractDynamicPanel createCRPanel() {
        return new BankFormPanel();
    }

    @Override
    public AbstractDynamicPanel createTRPanel() {
        return new BankTxnPanel();
    }

    @Override
    public JButton createReportButton() {
        return new JButton("Generate Report");
    }

}
