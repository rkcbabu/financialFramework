package project.framework.ui;


import java.util.List;
import project.framework.Controller;


//import finance.view.CRModel;
//import finance.view.TRModel;
//import framework.controllers.FrameworkController;
//import framework.interfaces.IDataSet;
//import framework.reporting.Report;
//import framework.view.AbstractCRFactory;
//import framework.view.MainView;

public class UIController {

	private MainView mainView;
	protected AbstractCRFactory crDialogFactory;
	private Controller controller;

	public UIController(MainView mainView,
			AbstractCRFactory crDialogFactory) {
		this.mainView = mainView;
		this.crDialogFactory = crDialogFactory;
		mainView.getCRPanel().addActionListenerToButtons(new RegistrationActionListener(this, crDialogFactory));
		mainView.getTRPanel().addActionListenerToButtons(new TransactionActionListener(this));
		mainView.getReportButton().addActionListener(new ReportActionListener(this));

	}

	public void setFrameWorkcontroller(Controller controller) {
		this.controller = controller;
	}

	public void updateTable(List<IDataSet> dataSetList) {
		mainView.setTableModel(dataSetList);
	}

	public void transactionPerformed(TRModel trForm) {
		controller.executeTransaction(
				Integer.parseInt(trForm.getName()), trForm.getAmount(),
				trForm.getTransactionType());
	}

	public void registerCustomer(CRModel crModel) {
//		controller.createCustomer(crModel, "", "");
	}

	public int getAccountNumber() {
		return mainView.getAccountNumber();
	}

	public Report getReport() {
		return controller.getReport();
	}

//	public void addInterest() {
//		controller.addInterest();
//	}
}
