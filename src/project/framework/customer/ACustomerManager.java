package project.framework.customer;

import java.util.List;
import java.util.Vector;
import project.framework.search.Predicate;
import project.framework.search.SearchById;

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
    public ICustomer find(int id, Predicate p) {
        ICustomer customer = null;
        
        for (ICustomer c: customerList){
            if (p.search(c.getId())){
                customer = c;
                break;
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
