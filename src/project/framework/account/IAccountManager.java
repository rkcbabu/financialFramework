package project.framework.account;

public interface IAccountManager {

//	private IAccount iAccount;

	public abstract void add(IAccount acc);

	public abstract void find(int id);

	public abstract void findAll();

}
