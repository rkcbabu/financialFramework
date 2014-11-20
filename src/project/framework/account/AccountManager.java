package project.framework.account;

import java.util.ArrayList;
import java.util.List;

import project.framework.account.AAccountManager;
import project.framework.account.IAccount;

public class AccountManager extends AAccountManager {

    private List<IAccount> accounts = new ArrayList<IAccount>();

    @Override
    public void add(IAccount account) {
        accounts.add(account);
    }

    @Override
    public IAccount find(int accNo) {
        for (IAccount account : accounts) {
            if (account.getId() == accNo) {
                return account;
            }
        }
        return null;
    }

    @Override
    public List<IAccount> getAll() {
        return accounts;
    }

}
