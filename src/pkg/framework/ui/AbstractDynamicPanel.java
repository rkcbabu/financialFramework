/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg.framework.ui;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

public class AbstractDynamicPanel extends JPanel {

    private List<AppButton> buttons;

    public AbstractDynamicPanel() {
        buttons = new ArrayList<AppButton>();
    }

    public void addButton(AppButton button) {
        this.add(button);
        buttons.add(button);
    }

    public void addActionListenerToButtons(ActionListener actionListener) {
        for (JButton button : buttons) {
            button.addActionListener(actionListener);
        }
    }
}
