package project.framework.factory;

import project.app.DefaultCRPanel;
import project.app.DefaultTRPanel;
import javax.swing.JButton;

import project.framework.ui.AbstractDynamicPanel;

public class DefaultUIFactory implements IUIFactory {

	@Override
	public AbstractDynamicPanel createCRPanel() {
		return new DefaultCRPanel();
	}

	@Override
	public AbstractDynamicPanel createTRPanel() {
		return new DefaultTRPanel();
	}

	@Override
	public JButton createReportButton() {
		return new JButton("Generate Report");
	}

}
