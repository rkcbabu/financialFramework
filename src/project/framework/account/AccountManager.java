package project.framework.account;

import java.util.Vector;

public class AccountManager extends AAccountManager {
    Vector<IAccount> accountList;
    public AccountManager(){
        accountList=new Vector<IAccount>();

    }
    
    @Override
    public void add(IAccount acc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
