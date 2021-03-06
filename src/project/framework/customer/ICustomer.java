package project.framework.customer;

import project.framework.account.IAccount;
import java.util.List;

import project.framework.transaction.Transaction;
import project.framework.reporting.Report;
import project.framework.transaction.ITransaction;

public interface ICustomer {

    public boolean add(IAccount account);

    public boolean remove(IAccount account);

    public boolean sendEmail(ITransaction transaction, IAccount account);

    public boolean checkEmailSendingCondition(Transaction transaction);

    public List<IAccount> getAll();

    public Address getAddress();

    public String getName();

    public String getEmail();

    public String getType();

    public Report getReport();

}
