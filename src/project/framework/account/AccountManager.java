package project.framework.account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AccountManager extends AAccountManager {

    HashMap<Integer, IAccount> accountList;

    public AccountManager() {
        accountList = new HashMap<>();

    }

    @Override
    public void add(IAccount acc) {
        accountList.put(acc.getId(), acc);

    }

    @Override
    public IAccount find(int id) {
    IAccount acc=null;
        try{
            acc=accountList.get(id);
        }
        catch(Exception e){
            System.out.println("Account not found");
        }
        return acc;
    }

    @Override
    public List<Account> getAll() {
        List<Account> allAccounts=new ArrayList<Account>();
        allAccounts=(List<Account>)this.accountList;
        return allAccounts;
    }
}
