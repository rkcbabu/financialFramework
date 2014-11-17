package project.framework;

public abstract class Controller implements IController {

	public abstract void requestTransaction();

	public abstract void undoTransaction();

	public abstract void createCustomer();

}
