package project.framework;


import java.util.List;


import project.framework.reporting.Report;
import project.framework.factory.AbstractCRFactory;
import project.framework.ui.MainView;

public class UIController {

	private MainView mainView;
	protected AbstractCRFactory crDialogFactory;
	private Controller controller;

	public UIController(MainView mainView,
			AbstractCRFactory crDialogFactory) {
		this.mainView = mainView;
		this.crDialogFactory = crDialogFactory;
		init();

	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

	private void init() {
		mainView.getCRPanel().addActionListener(
				new RegistrationActionListener(this, crDialogFactory));
		mainView.getTRPanel().addActionListener(
				new TransactionActionListener(this));
		mainView.getReportButton().addActionListener(
				new ReportActionListener(this));
	}

	public void updateTable(List<ICellData> dataSetList) {
		mainView.setTableModel(dataSetList);
	}

	public void transactionPerformed(TxnModel trForm) {
		controller.executeTransaction(
				Integer.parseInt(trForm.getName()), trForm.getAmount(),
				trForm.getTransactionType());
	}

	public void registerCustomer(FormModel crModel) {
		controller.createCustomer(crModel, "", "");
	}

	public int getAccountNumber() {
		return mainView.getAccountNumber();
	}

	public Report getReport() {
		return controller.getReport();

	}

	public void addInterest() {
		controller.addInterest();
	}
}
