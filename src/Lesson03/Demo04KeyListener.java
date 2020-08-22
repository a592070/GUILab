package Lesson03;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo04KeyListener {
    public static void main(String[] args) {
        new SimpleFrame04().loadFrame();
    }
}

class SimpleFrame04 extends Frame{
    List<Point> points;
    Point current;

    public void loadFrame(){
        setTitle("Key Listener Window");
        setBounds(100, 100, 700, 700);
//        setMaximizedBounds(new Rectangle(700,700));
        setMaximumSize(new Dimension(700,700));
        setVisible(true);


        points = new ArrayList<>();
        current = new Point(350,350);


        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                SimpleFrame04 frame = (SimpleFrame04) e.getSource();
                Point point = new Point();
                point.setLocation(current);
                int keyCode = e.getKeyCode();
                switch (keyCode){
                    case KeyEvent.VK_UP:
                        point.setLocation(current.getX() , current.getY()-20);
                        points.add(point);
                        break;
                    case KeyEvent.VK_DOWN:
                        point.setLocation(current.getX() , current.getY()+20);
                        points.add(point);
                        break;
                    case KeyEvent.VK_RIGHT:
                        point.setLocation(current.getX()+20 , current.getY());
                        points.add(point);
                        break;
                    case KeyEvent.VK_LEFT:
                        point.setLocation(current.getX()-20 , current.getY());
                        points.add(point);
                        break;
                    default:
                        break;
                }
                repaint();
            }

//            @Override
//            public void keyReleased(KeyEvent e) {
//                SimpleFrame04 frame = (SimpleFrame04) e.getSource();
//
//            }
        });

    }

    @Override
    public void paint(Graphics g) {
//        super.paint(g);
        Iterator<Point> iter = points.iterator();
        while(iter.hasNext()){
            current = iter.next();
            g.setColor(Color.CYAN);
            g.fillOval(current.x, current.y, 10,10);
        }
    }
}
