package project.framework.account;

import java.util.List;

import project.framework.Controller;

public interface IAccountManager {

    public void add(IAccount account);

    public IAccount find(int account_no);

    public List<IAccount> getAll();

    public void setAccountChanged();

    public void setController(Controller controller);
}
