/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.logic;

import project.framework.customer.IPerson;
import project.framework.customer.Person;

/**
 *
 * @author acer
 */
public class TestLogic {
    public static void main(String[] args){
        Person person;
        IPredicate rule=new IsPerson();
        person=new Person(null, null, null, null);
        if(rule.execute(person))
            System.out.println("correct");
        
    }
}
