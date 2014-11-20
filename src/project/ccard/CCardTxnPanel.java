package project.ccard;

import javax.swing.BoxLayout;

import project.framework.ui.AbstractDynamicPanel;
import project.framework.ui.AppButton;

public class CCardTxnPanel extends AbstractDynamicPanel {

    public CCardTxnPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        AppButton button = new AppButton("Deposit", "deposit");
        AppButton withdraw = new AppButton("Charge", "withdraw");
        this.addButton(button);
        this.addButton(withdraw);
        this.addButton(new AppButton("Add interest", "addinterest"));
    }
}
