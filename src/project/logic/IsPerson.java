/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.logic;

import project.framework.customer.ICustomer;
import project.framework.customer.Person;

/**
 *
 * @author acer
 */
public class IsPerson extends Predicate<ICustomer>{
    
   @Override
    public boolean execute(ICustomer element) {
       if(element.getType().trim().equalsIgnoreCase("person"))
           return true;
       else return false;
               

}
  
}