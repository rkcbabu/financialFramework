package project.framework.account;

import java.util.List;

public interface IAccountManager {

//	private IAccount iAccount;

	public  void add(IAccount acc);

	public  IAccount find(int id);

	public  List<IAccount>  getAll();
        
        public void remove(IAccount acc);
       
        


}
