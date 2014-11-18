package project.framework.customer;

import java.util.Vector;
import project.framework.account.IAccount;

public abstract class ACustomer implements ICustomer {

    private String name;
    private String phone;
    private Vector<IAccount> accountList = new Vector();

    /**
     *
     * @param acc
     */
    @Override
    public void addAccount(IAccount acc) {
        accountList.add(acc);
    }

    /**
     *
     * @param acc
     */
    @Override
    public void removeAccount(IAccount acc) {
        accountList.remove(acc);
    }

    /**
     * @return 
     * @see ICustomer#getInfo()
     *
     *
     */
    @Override
    public String getInfo() {
        return name;
    }

    /**
     * @see ICustomer#sendEmail()
     *
     *
     */
    public void sendEmail() {

    }

}
