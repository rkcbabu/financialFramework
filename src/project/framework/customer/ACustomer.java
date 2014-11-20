package project.framework.customer;

import java.util.ArrayList;
import java.util.List;

import project.framework.account.IAccount;
import project.framework.transaction.ITransaction;
import project.framework.transaction.Transaction;

public abstract class ACustomer implements ICustomer {

    private Address address;
    private String name;
    private String email;

    private List<IAccount> accounts = new ArrayList<IAccount>();

    public ACustomer(Address address, String name, String email) {
        super();
        this.address = address;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean add(IAccount account) {
        accounts.add(account);
        return true;
    }

    @Override
    public boolean remove(IAccount account) {
        return accounts.remove(account);
    }

    @Override
    public List<IAccount> getAll() {
        return accounts;
    }

    @Override
    public boolean sendEmail(ITransaction transaction, IAccount account) {

        return false;
    }

    @Override
    public abstract boolean checkEmailSendingCondition(Transaction transaction);

    @Override
    public abstract String getType();

    @Override
    public Address getAddress() {
        return address;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

}
