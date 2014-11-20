/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.framework.logic;

/**
 *
 * @author acer
 */
public abstract class Predicate<T> implements IPredicate<T> {

    @Override
    public boolean execute(T element) {
        return false;
    }

    @Override
    public boolean isGreater(T element1, T element2) {
        return false;
    }
}
