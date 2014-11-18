package project.framework;

import project.framework.account.IAccount;
import project.framework.customer.ICustomer;

public interface IController {
	public  void requestTransaction();

	public  void undoTransaction();

	public  ICustomer createCustomer();
        public void addAccount(IAccount acc);

}
