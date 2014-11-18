package project.framework.customer;

import java.util.List;
import java.util.Vector;
import project.frameworksearch.Predicate;
import project.frameworksearch.SearchById;

public abstract class ACustomerManager implements ICustomerManager {

    private String type;
    protected Vector<ICustomer> customerList;
    
    public ACustomerManager(){
        customerList = new Vector();
    }

    public abstract void emailNotify();

    /**
     * @param cus
     * @see ICustomerManager#add(ICustomer)
     *
     */
    @Override
    public void add(ICustomer cus) {
        customerList.add(cus);
    }

    /**
     * @see ICustomerManager#find(int)
     *
     *
     */
    public ICustomer find(int id) {
        ICustomer customer = null;
       
        for (ICustomer c: customerList){
            if (c.getId()==id){
               return c;
            }
        }
        return customer;
    }

    /**
     * @see ICustomerManager#getAll()
     *
     */
    public List<ICustomer> getAll() {
        return customerList;
    }

    /**
     * @see ICustomerManager#getType()
     *
     */
    public String getType() {
        return type;
    }

}
