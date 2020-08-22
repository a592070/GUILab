package Lesson06;

import javax.swing.*;
import java.awt.*;

public class Demo01ComboBox extends JFrame {
    public Demo01ComboBox() {
        Container contentPane = this.getContentPane();
        setVisible(true);
//        setBounds(50, 50, 500, 500);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JComboBox  status = new JComboBox();
        status.addItem("option1");
        status.addItem("option2");
        status.addItem("option3");

        JPanel panel = new JPanel();
        panel.add(status);
//        panel.setVisible(true);

        contentPane.add(panel);


    }

    public static void main(String[] args) {
        new Demo01ComboBox();
    }
}
