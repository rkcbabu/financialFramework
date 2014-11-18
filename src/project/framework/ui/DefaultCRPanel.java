/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.framework.ui;

/**
 *
 * @author Ram Krishna Chaulagai< rkcbabu@gmail.com >
 */
public class DefaultCRPanel extends AbstractDynamicPanel {

	public DefaultCRPanel() {
		AppButton button = new AppButton("Add customer","addcustomer");
		this.add(button);
		this.addButton(button);
	}
}
