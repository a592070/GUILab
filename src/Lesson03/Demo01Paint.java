package Lesson03;

import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;

public class Demo01Paint {
    public static void main(String[] args) {
        new SimpleFrame().loadFrame();
    }
}

class SimpleFrame extends JFrame {
    int width = 700;
    int height = 700;
    public void loadFrame(){
        setBounds(0, 0, width, height);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
//        super.paint(g);
        g.setColor(Color.red);

//        g.drawOval(100,100,200,200);
//        g.fillOval(400,100,200,200);


        double[] arr1 = {0.5, 1, 1.2, 0.7, -0.5, -1, 1};
        double[] arr2 = {1,2,3,4,5,6,7};

        int countX = 50;
        int countY = 20;
        int startX = 0;
        int startY = height/2;

        g.clipRect(100,100,100,100);

//        g.drawLine(startX, startY);


        for (int i = 0; i < arr2.length; i++) {
            int x = startX+50;
            int y = startY - BigDecimal.valueOf(countY * arr1[i]).intValue();
            g.setColor(Color.red);
            g.drawLine(startX, startY, x, y);

            g.setColor(Color.BLUE);
            g.fillOval(x, y, 10,10);

            startX = x;
            startY = y;
        }

    }
}
