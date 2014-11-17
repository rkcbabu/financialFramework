package project.framework.transaction;

import java.util.Date;

public class ATransaction implements ITransaction {

	private double amount;

	private Date txnDate;


	/**
	 * @see ITransaction#execute()
	 */
	public void execute() {

	}


	/**
	 * @see ITransaction#undo()
	 */
	public void undo() {

	}

}
