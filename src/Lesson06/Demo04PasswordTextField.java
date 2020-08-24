package Lesson06;

import javax.swing.*;
import java.awt.*;

public class Demo04PasswordTextField extends JFrame{

    public Demo04PasswordTextField() {
        Container contentPane = this.getContentPane();

        JPasswordField passwordField = new JPasswordField();
        passwordField.setEchoChar('#');


        contentPane.add(passwordField , BorderLayout.NORTH);



        this.setVisible(true);
        this.setBounds(10,10,500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo04PasswordTextField();
    }
}
