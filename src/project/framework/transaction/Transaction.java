package project.framework.transaction;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import project.framework.account.IAccount;

public abstract class Transaction implements ITransaction {

    private String date;
    protected double amount;
    private String name;
    protected IAccount account;

    public Transaction(IAccount account, Double amount, String name) {
        super();
        this.account = account;
        this.date = (new SimpleDateFormat("yyyy/MM/dd")).format(Calendar.getInstance().getTime());
        this.amount = amount;
        this.name = name;

    }

    public Double getAmount() {
        return amount;
    }

    public void execute() {
        account.addBalance(amount);
        account.notifyCustomer(this);
    }

    @Override
    public String toString() {
        return "*********************Trasnsaction details***************" + "\n"
                + "  " + "acount ID:" + account.getId() + "\n"
                + "  " + "         type: " + getType() + "\n"
                + "  " + "amount  :" + amount;
    }

    public abstract String getType();

    public String getDate() {
        return date;
    }

    public IAccount getAccount() {
        return account;
    }
}
