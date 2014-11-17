package project.framework;

public interface IController {
//
//	private ITransactionManager iTransactionManager;
//
//	private IAccountManager iAccountManager;
//
//	private ICustomerManager iCustomerManager;

	public abstract void requestTransaction();

	public abstract void undoTransaction();

	public abstract void createCustomer();

}
