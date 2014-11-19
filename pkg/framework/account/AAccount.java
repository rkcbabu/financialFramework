package pkg.framework.account;

import pkg.framework.customer.ICustomer;

public abstract class AAccount implements IAccount {

    protected double balance;
    ICustomer customer;
    private static int id;

    public abstract void addInterest();

     public  void sendEmail(){
        this.getCustomer().sendEmail();
    }
    
  public ICustomer getCustomer(){
      return customer;
  }
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
        if((balance-amt)>=0)
        balance -= amt;
    }
}
