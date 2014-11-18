package project.framework.account;

import java.util.List;
import java.util.Vector;

public abstract class AAccountManager implements IAccountManager {

    Vector<IAccount> accountList;

    public AAccountManager() {
        
        accountList = new Vector<IAccount>();
      

    }
    public void addInterest(){
        
        for(IAccount acc:accountList){
            acc.addInterest();
        }
        
    }

    public void add(IAccount acc) {
        accountList.add(acc);
    }

    public abstract IAccount find(int id);

    public abstract List<IAccount> getAll();

    public void remove(IAccount acc) {
        accountList.remove(acc);
    }
}
