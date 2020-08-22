package Lesson03;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo02Paint {
    public static void main(String[] args) {
        new SimpleFrame02().loadFrame();
    }
}

class SimpleFrame02 extends Frame {
    // List 儲存監聽滑鼠的點point
    List<Point> points;

    public void loadFrame(){
        setBounds(100, 100, 700, 700);
        setVisible(true);

        points = new ArrayList<>();

        this.addMouseListener(new SimpleMouseListener());

    }

    // 將ArrayList存的點畫出來
    @Override
    public void paint(Graphics g) {
//        super.paint(g);

        Iterator<Point> iter = points.iterator();
        while(iter.hasNext()){
            Point point = iter.next();
            g.setColor(Color.CYAN);
            g.fillOval(point.x, point.y, 10,10);
        }
    }

    // 添加一個點到 List上
    public void addPoint(Point point){
        points.add(point);
    }

    // 適配器模式 MouseAdapter 取代 MouseListener
    private class SimpleMouseListener extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            SimpleFrame02 frame = (SimpleFrame02) e.getSource();
            frame.addPoint(new Point(e.getX() , e.getY()));

            frame.repaint();
        }
    }


}
