/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.logic;

/**
 *
 * @author acer
 */
public interface IPredicate<T> {
    
   public boolean execute(T element);
   public boolean isGreater(T element1, T element2);
  

}
