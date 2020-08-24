package Lesson07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TimerListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        GamePanel panel = (GamePanel) e.getSource();
        if(panel.isStart){
            ActionMove move = new ActionMove();

            List<Point> list = panel.list;
            Point head = new Point(list.get(0));
            String fx = panel.fx;
            switch(fx){
                case "U":
                    move.moveUP(head , list);
                    panel.repaint();
                    break;
                case "D":
                    move.moveDown(head , list);
                    panel.repaint();
                    break;
                case "R":
                    move.moveRight(head , list);
                    panel.repaint();
                    break;
                case "L":
                    move.moveLeft(head , list);
                    panel.repaint();
                    break;
                default:
                    break;
            }
        }
    }
}
