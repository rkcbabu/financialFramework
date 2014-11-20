package project.framework.account;

import java.util.ArrayList;
import project.framework.transaction.Transaction;
import project.framework.customer.ICustomer;
import project.framework.transaction.ITransaction;
import project.framework.transaction.ITransactionManager;
import project.logic.IPredicate;
import project.logic.IsCompany;

public abstract class AAccount implements IAccount {

    private int accId;
    private double currentBalance;
    protected ICustomer customer;
    protected IAccountManager accountManager;
    protected ITransactionManager transactionManger;
    protected ArrayList<ITransaction> transactionList;
    protected IPredicate validator;

    public AAccount(int accId, ICustomer customer) {
        super();
        this.accId = accId;
        this.customer = customer;
        transactionList=new ArrayList<>();
        
    }

    public AAccount(ICustomer customer) {
        this.customer = customer;
       
        accId++;
         transactionList=new ArrayList<>();

    }

    @Override
    public final void setManagers(IAccountManager accountManger, ITransactionManager transactionManager) {
        this.accountManager = accountManger;
        this.transactionManger = transactionManager;
    }

    @Override
    public  void addBalance(ITransaction txn) {
        double amount=txn.getAmount();
        this.transactionList.add(txn);
        validator=new IsCompany();
        if(validator.execute(getCustomer())){
            getCustomer().sendEmail(txn, this);
        }
       
        
        currentBalance += amount;
    }

    @Override
    public final int getId() {
        return accId;
    }

    @Override
    public final double getCurrentBalance() {
        return currentBalance;
    }

    @Override
    public final ICustomer getCustomer() {
        return customer;
    }

    @Override
    public final void notifyCustomer(Transaction transaction) {
        customer.sendEmail(transaction, this);
    }

    @Override
    public final void setChanged() {
        accountManager.setAccountChanged();
    }

    @Override
    public String getExpiryDate() {
        // TODO Auto-generated method stub
        return null;
    }
}
