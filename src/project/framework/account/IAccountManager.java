package project.framework.account;

import java.util.List;


import project.framework.Controller;

public interface IAccountManager {
	
	public void addAccount(IAccount account);
	public IAccount findAccount(int account_no);
	public List<IAccount> getAllAccounts();
	public void setAccountChanged() ;
	public void setController(Controller controller);
}
