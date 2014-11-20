/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.framework.logic;

import project.framework.customer.ICustomer;

/**
 *
 * @author acer
 */
public class IsCompany extends Predicate<ICustomer> {
    
    @Override
    public boolean execute(ICustomer element) {
       if(element.getType().trim().equalsIgnoreCase("organization"))
           return true;
       else return false;
               

}
}
