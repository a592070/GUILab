package Lesson06;

import javax.swing.*;
import java.awt.*;

public class Demo03TextField extends JFrame {
    public Demo03TextField() {
        Container contentPane = this.getContentPane();
//        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));

        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField("Hello world" , 10);

        contentPane.add(textField1 , BorderLayout.NORTH);
        contentPane.add(textField2 , BorderLayout.SOUTH);



        this.setVisible(true);
        this.setBounds(10,10,500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo03TextField();
    }
}
