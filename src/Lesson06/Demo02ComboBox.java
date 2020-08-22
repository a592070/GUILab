package Lesson06;

import javax.swing.*;
import java.awt.*;

public class Demo02ComboBox extends JFrame {
    public Demo02ComboBox() {
        Container contentPane = this.getContentPane();
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEADING));

        String[] contents = {"1","2","3"};
        JList jList = new JList(contents);



        JPanel panel = new JPanel();
        panel.add(jList);

        contentPane.add(panel);


//        setBounds(50, 50, 500, 500);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo02ComboBox();
    }
}
