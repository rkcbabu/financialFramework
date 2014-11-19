package pkg.framework.customer;

import java.util.Date;
import java.util.Vector;
import pkg.framework.account.IAccount;

public abstract class ACustomer implements ICustomer {

    protected String name;
    protected String phone;
    Address customerAddress;
    private static int id;
    protected String email;

    private Vector<IAccount> accountList = new Vector();

    public ACustomer(String name, String phone,String email) {
        this.name = name;
       this. phone = phone;
        this.email=email;
        id++;
    }

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
     * @return @see ICustomer#getInfo()
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

        System.out.println("Email sent to customer ");
    }

    public int getId() {
        return id;
    }
}
