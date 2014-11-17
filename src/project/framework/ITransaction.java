package project.framework;

public interface ITransaction {

//	private IAccount iAccount;

	public abstract void execute();

	public abstract void undo();

}
