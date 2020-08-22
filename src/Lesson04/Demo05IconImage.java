package Lesson04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Demo05IconImage extends JFrame{
    public Demo05IconImage() {
        JLabel label = new JLabel("ImageIcon");
        URL resource = Demo05IconImage.class.getResource("/res/005-check-mark.png");

        ImageIcon imageIcon = new ImageIcon(resource);


        label.setIcon(imageIcon);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setBounds(50,50,100,100);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.LIGHT_GRAY);
        contentPane.add(label);
        contentPane.setLayout(null);

        setBounds(50,50,700,700);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Demo05IconImage();
    }
}
