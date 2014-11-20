package project.ccard;

import project.framework.ui.AbstractDynamicPanel;
import project.framework.ui.AppButton;

public class CCardFormPanel extends AbstractDynamicPanel {

    public CCardFormPanel() {
        this.addButton(new AppButton("Add credit card account", "ccard"));
    }

}
