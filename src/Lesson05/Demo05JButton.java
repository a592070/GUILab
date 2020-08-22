package Lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Demo05JButton extends JFrame {
    public Demo05JButton() {
        Container contentPane = this.getContentPane();

//        URL resource = Demo03JButton.class.getResource("/res/checked.png");
//        Icon icon = new ImageIcon(resource);

        // 單選框
        JCheckBox checkBox1 = new JCheckBox("option1");
        JCheckBox checkBox2 = new JCheckBox("option1");
        JCheckBox checkBox3 = new JCheckBox("option1");


        contentPane.setLayout(new FlowLayout(FlowLayout.LEADING));
        contentPane.add(checkBox1);
        contentPane.add(checkBox2);
        contentPane.add(checkBox3);


        setVisible(true);
        setBounds(50, 50, 500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo05JButton();
    }
}
