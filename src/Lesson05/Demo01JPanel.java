package Lesson05;


import javax.swing.*;
import java.awt.*;

public class Demo01JPanel extends JFrame {
    public Demo01JPanel() {
        Container contentPane = getContentPane();

        // GridLayout(int rows, int cols, int hgap, int vgap):  gap間距
        contentPane.setLayout(new GridLayout(2,1,30,30));

        JPanel panel1 = new JPanel(new GridLayout(1,3));
        JPanel panel2 = new JPanel(new GridLayout(3,1));

        panel1.add(new Button("click1"));
        panel1.add(new Button("click2"));
        panel1.add(new Button("click3"));

        panel2.add(new Button("click1"));
        panel2.add(new Button("click3"));
        panel2.add(new Button("click2"));


        contentPane.add(panel1);
        contentPane.add(panel2);

        setVisible(true);
        setBounds(50,50,500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Demo01JPanel();
    }
}
