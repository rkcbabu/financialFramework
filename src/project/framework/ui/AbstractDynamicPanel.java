package project.framework.ui;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

public class AbstractDynamicPanel extends JPanel {

	private List<AppButton> buttons;

	public AbstractDynamicPanel() {
		buttons = new ArrayList<AppButton>();
		for(JButton button:buttons){
			this.add(button);
		}
	}

	public void addButton(AppButton button) {
		this.add(button);
		buttons.add(button);
	}

	public void addActionListener(ActionListener actionListener) {
		for (JButton button : buttons) {
			button.addActionListener(actionListener);
		}
	}
}
