package Lesson05;

import javax.swing.*;
import java.awt.*;

public class Demo02JScroll extends JFrame {
    public Demo02JScroll() {
        Container contentPane = getContentPane();


        JTextArea textArea = new JTextArea(50,20);
        textArea.setText("Text");


        JScrollPane scrollPane = new JScrollPane(textArea);

        contentPane.add(scrollPane);


        setVisible(true);
        setBounds(50,50,500,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo02JScroll();
    }
}
