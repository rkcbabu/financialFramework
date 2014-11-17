package project.framework.customer;

import project.framework.account.IAccount;
import java.util.Date;

public class Person extends ACustomer implements IPerson {

    @Override
    public void addAccount(IAccount acc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAccount(IAccount acc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date getBirthdate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//	 Date getBirthdate();

}
