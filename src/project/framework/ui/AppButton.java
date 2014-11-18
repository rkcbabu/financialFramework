/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.framework.ui;

import javax.swing.JButton;

public class AppButton extends JButton {
    private String type;

	public AppButton(String label, String type) {
		this.type = type;
		this.setText(label);
	}

	public String getType() {
		return type;
	}
}
