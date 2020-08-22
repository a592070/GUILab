package Lesson04;

import javax.swing.*;
import java.awt.*;

public class Demo04Icon extends JFrame implements Icon {
    private int width;
    private int height;

    public void init(){
        Demo04Icon icon = new Demo04Icon(25,25);
        JLabel label = new JLabel("icon", icon, SwingConstants.CENTER);

        Container contentPane = getContentPane();
        contentPane.add(label);

        this.setVisible(true);
        this.setBounds(50,50,500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo04Icon().init();
    }

    public Demo04Icon(){
    }

    public Demo04Icon(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,this.width,this.height);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }
}
