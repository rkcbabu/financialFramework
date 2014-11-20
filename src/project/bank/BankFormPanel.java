package project.bank;

import project.framework.ui.AbstractDynamicPanel;
import project.framework.ui.AppButton;

public class BankFormPanel extends AbstractDynamicPanel {

    public BankFormPanel() {
        this.addButton(new AppButton("Add personal account", "personal"));
        this.addButton(new AppButton("Add company account", "company"));
    }
}
