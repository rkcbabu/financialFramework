package project.framework.account;

import java.util.ArrayList;
import java.util.List;


import project.framework.account.AAccountManager;
import project.framework.account.IAccount;

public class AccountManager extends AAccountManager{

	private List<IAccount> accounts = new ArrayList<IAccount>();

	@Override
	public void addAccount(IAccount account) {
		accounts.add(account);
	}

	@Override
	public IAccount findAccount(int account_no) {
		for (IAccount account : accounts) {
			if (account.getAccountNumber() == account_no) {
				return account;
			}
		}
		return null;
	}

	@Override
	public List<IAccount> getAllAccounts() {
		return accounts;
	}

	


}