package project.framework.account;

import project.framework.customer.ICustomer;

public  class Account extends AAccount {

    public Account(ICustomer cus){
        super(cus);
    }
    public  void sendEmail(){
        this.getCustomer().sendEmail();
    }
    
  public ICustomer getCustomer(){
      return customer;
  }
}
