package project.ccard;

import java.util.ArrayList;
import java.util.List;
import project.framework.account.AAccountManager;
import project.framework.account.IAccount;

public class CCardAccountManager extends AAccountManager {

    private List<IAccount> accounts = new ArrayList<IAccount>();

    @Override
    public void add(IAccount account) {
        accounts.add(account);
    }

    @Override
    public IAccount find(int account_no) {
        for (IAccount account : accounts) {
            if (account.getId() == account_no) {
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
