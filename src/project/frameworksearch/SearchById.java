/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.frameworksearch;

/**
 *
 * @author Prakash
 */
public class SearchById<T> implements Predicate<T>{

    T temp;
    
    public SearchById(T t){
        temp = t;
    }
    
    @Override
    public boolean search(T t) {
        if (temp == t)
            return true;
        return false;
    }
    
}
