package project.framework.account;

import java.util.HashMap;
import java.util.List;

public abstract class AAccountManager implements IAccountManager {

    HashMap<Integer, IAccount> accountList;

    public AAccountManager() {
        accountList = new HashMap<>();

    }

    public void add(IAccount acc) {
        accountList.put(acc.getId(), acc);
    }

    public abstract IAccount find(int id);

    public abstract List<Account> getAll();

    public void remove(IAccount acc) {
        accountList.remove(acc);
    }
}
