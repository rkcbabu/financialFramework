/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.framework.ui;

import java.util.Vector;

/**
 *
 * @author Ram Krishna Chaulagai< rkcbabu@gmail.com >
 */
public interface IDataSet<R> {
	public Vector toVector();
	public R getData();

}