package project.framework.account;

public abstract  class AAccountManager implements IAccountManager {

	private AAccount aAccount;

	public abstract void add();

	public abstract void find(int id);

	public abstract void findAll();

}
