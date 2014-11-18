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
        accountList.add(acc);

    }

    @Override
    public IAccount find(int id) {
    
    
    for(IAccount a:accountList){
        if(a.getId()==id)
            return a;
    }
      
        return null;
    }

    @Override
    public List<IAccount> getAll() {
        List<IAccount> allAccounts=new ArrayList<IAccount>();
      for(IAccount a:accountList)
          allAccounts.add(a);
           
        return allAccounts;
    }
}
