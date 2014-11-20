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
