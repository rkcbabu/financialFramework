package project.framework.account;

import java.util.Observable;


import project.framework.Controller;

public abstract class AAccountManager extends Observable implements IAccountManager{
    
	private Controller controller;
	
	
	@Override
	public final void setController(Controller controller){
		this.controller = controller;
		addObserver(controller);
	}

	@Override
	public final void setAccountChanged() {
		setChanged();
		notifyObservers();
	}

}
