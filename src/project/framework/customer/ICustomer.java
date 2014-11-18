package project.framework.customer;

import project.framework.account.IAccount;
import project.framework.ui.Report;

public interface ICustomer {

//	private IAddress iAddress;
    public abstract String getInfo();

    public abstract void addAccount(IAccount acc);

    public abstract void removeAccount(IAccount acc);

    public abstract void sendEmail();

    public abstract int getId();

    public Report getReport();
}
