package pkg.framework.customer;

import pkg.framework.account.IAccount;
import pkg.framework.ui.Report;

public interface ICustomer {

//	private IAddress iAddress;
    public abstract String getInfo();

    public abstract void addAccount(IAccount acc);

    public abstract void removeAccount(IAccount acc);

    public abstract void sendEmail();

    public abstract int getId();

    public Report getReport();
    public String getType();
}
