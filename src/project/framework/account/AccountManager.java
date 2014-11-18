package project.framework.account;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AccountManager extends AAccountManager {

    public AccountManager(){
       
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
    public List<IAccount> getAll() {
        List<IAccount> allAccounts=new ArrayList<IAccount>();
       // allAccounts=(List<Account>)this.accountList;
     
        Iterator acc=accountList.entrySet().iterator();
    //  allAccounts.add(a);
        while(acc.hasNext()){
            Map.Entry me = (Map.Entry)acc.next();
       
          allAccounts.add((IAccount)me.getValue());
        }
           
        return allAccounts;
    }
}
