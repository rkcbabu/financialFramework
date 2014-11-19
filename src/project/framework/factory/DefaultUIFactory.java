package project.framework.factory;

import project.app.AppFormPanel;
import project.app.AppTxnPanel;
import javax.swing.JButton;

import project.framework.ui.AbstractDynamicPanel;

public class DefaultUIFactory implements IUIFactory {

	@Override
	public AbstractDynamicPanel createCRPanel() {
		return new AppFormPanel();
	}

	@Override
	public AbstractDynamicPanel createTRPanel() {
		return new AppTxnPanel();
	}

	@Override
	public JButton createReportButton() {
		return new JButton("Generate Report");
	}

}
