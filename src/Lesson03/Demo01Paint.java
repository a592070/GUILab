package Lesson03;

import java.awt.*;

public class Demo01Paint {
    public static void main(String[] args) {
        new SimpleFrame().loadFrame();
    }
}

class SimpleFrame extends Frame {
    public void loadFrame(){
        setBounds(100, 100, 700, 700);
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
//        super.paint(g);
        g.setColor(Color.CYAN);

        g.drawOval(100,100,200,200);
        g.fillOval(400,100,200,200);
    }
}
