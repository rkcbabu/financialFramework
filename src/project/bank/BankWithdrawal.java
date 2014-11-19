package project.bank;

import project.framework.account.IAccount;
import project.framework.transaction.Transaction;



public class BankWithdrawal extends Transaction{

	public BankWithdrawal(IAccount account, Double amount, String name) {
		super(account, -amount, name);
	}

	@Override
	public String getType() {
		return "WithDrawal";
	}
	@Override
	public void execute() {
		super.execute();
		account.setChanged();
	}

}
