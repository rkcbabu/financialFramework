package project.framework.account;

import project.framework.customer.ICustomer;

public abstract class AAccount implements IAccount {

    private double balance;
    ICustomer customer;
    private static int id;


    public AAccount(ICustomer cus) {
        id++;
        customer = cus;  }

   
     public int getId(){
         return id;
     }
   
    public double getBalance() {
        return balance;
    }

    /**
     * @see IAccount#deposit()
     *
     *
     */
    public void deposit(double amt) {
        balance += amt;
    }

    /**
     * @see IAccount#withdraw()
     *
     *
     */
    public void withdraw(double amt) {
        balance -= amt;
    }
}
