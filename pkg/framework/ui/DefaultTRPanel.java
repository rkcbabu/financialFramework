/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg.framework.ui;

import javax.swing.BoxLayout;

/**
 *
 * @author Ram Krishna Chaulagai< rkcbabu@gmail.com >
 */
public class DefaultTRPanel extends AbstractDynamicPanel {

	public DefaultTRPanel() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		AppButton button = new AppButton("Deposit", "deposit");

		AppButton withdraw = new AppButton("Withdraw", "withdraw");
		this.add(button);
		this.addButton(button);
		this.add(withdraw);
		this.addButton(withdraw);
	}
}