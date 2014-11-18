package project.framework.customer;

import java.util.List;
import java.util.Vector;

public abstract class ACustomerManager implements ICustomerManager {

    private String type;
    protected Vector<ICustomer> customerList;

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
            if (c.getId() == id){
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
    public List getAll() {
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
