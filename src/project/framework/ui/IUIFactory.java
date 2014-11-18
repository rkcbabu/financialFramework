/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.framework.ui;

import javax.swing.JButton;

public interface IUIFactory {

    public AbstractDynamicPanel createCRPanel();

    public AbstractDynamicPanel createTRPanel();

    public JButton createReportButton();
}
