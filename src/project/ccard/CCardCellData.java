package project.ccard;

import java.util.Vector;
import project.framework.ICellData;
import project.framework.account.IAccount;
import project.framework.customer.ICustomer;

public class CCardCellData implements ICellData<Integer> {

    public ICustomer customer;
    public IAccount account;

    public CCardCellData(ICustomer customer, IAccount account) {
        super();
        this.customer = customer;
        this.account = account;
    }

    @Override
    public Vector<String> toVector() {
        Vector<String> newRow = new Vector<String>();
        newRow.add(customer.getName());
        //newRow.add(customer.getType());
        newRow.add("" + account.getId() + "");
        newRow.add(account.getExpiryDate());
        newRow.add(account.getType());
        newRow.add("" + account.getCurrentBalance() + "");
        return newRow;
    }

    @Override
    public Integer getData() {
        return account.getId();
    }

}
