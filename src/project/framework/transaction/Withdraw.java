package project.framework.transaction;


import project.framework.transaction.Transaction;
import project.framework.account.IAccount;

public class Withdraw extends Transaction{

	public Withdraw(IAccount account, Double amount, String name) {
		super(account, -amount, name);
	}

	@Override
	public String getType() {
		return "WithDrawal";
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		super.execute();
		account.setChanged();
	}
}
