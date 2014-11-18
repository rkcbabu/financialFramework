package project.framework.account;

import java.util.List;

public interface IAccountManager {

//	private IAccount iAccount;

	public abstract void add(IAccount acc);

	public abstract IAccount find(int id);

		public abstract List<Account>  getAll();


}
