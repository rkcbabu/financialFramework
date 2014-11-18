package project.framework.account;

import java.util.List;

public abstract  class AAccountManager implements IAccountManager {

	private AAccount aAccount;

	public abstract void add(IAccount acc);

	public abstract IAccount find(int id);

       
	public abstract List<Account>  getAll();

}
