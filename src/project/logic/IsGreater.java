/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.logic;

/**
 *
 * @author acer
 */
public class IsGreater extends Predicate<Double> {
    
    /**
     *
     * @param element1
     * @param element2
     * @return
     */
   // @Override
   public boolean isGreater(Double element1, Double element2){
       
     return (element1>element2);
         
   }
    
}
