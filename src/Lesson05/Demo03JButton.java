package Lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Demo03JButton extends JFrame {
    public Demo03JButton() {
        Container contentPane = this.getContentPane();

        URL resource = Demo03JButton.class.getResource("/res/checked.png");
        Icon icon = new ImageIcon(resource);

        JButton button = new JButton();
        button.setIcon(icon);
        button.setToolTipText("Image Button");

        contentPane.add(button);



        setVisible(true);
        setBounds(50,50,500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo03JButton();
    }
}
