package project.framework.customer;

import java.util.Observable;


import project.framework.Controller;

public abstract  class ACustomerManager extends Observable implements ICustomerManager {
	private Controller frameworkController;
	@Override
	public final void setController(Controller controller) {
		this.frameworkController = controller;
		addObserver(controller);
	}
	
	@Override
	public final boolean submitCustomer(ICustomer customer) {
		add(customer);
		setChanged();
		notifyObservers();
		return true;
	}
	
	

}
