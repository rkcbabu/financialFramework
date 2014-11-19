package project.bank;

import java.util.ArrayList;
import java.util.List;
import project.framework.account.AccountManager;
import project.framework.account.IAccount;

public class BankAccountManager extends AccountManager {
	
	private List<IAccount> accounts = new ArrayList<IAccount>();
	

	
//	@Override
	public void addAccount(IAccount account){
		accounts.add(account);
	}
	
//	@Override
	public IAccount findAccount(int account_no) {
		for (IAccount account : accounts) {
			if (account.getId() == account_no) {
				return account;
			}
		}
		return null;
	}

//	@Override
	public List<IAccount> getAllAccounts() {
		// TODO Auto-generated method stub
		return accounts;
	}

	
	
}
