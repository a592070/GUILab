package Lesson07;

import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class GameActionListener implements KeyListener, ActionListener {
    GamePanel panel;

    public GameActionListener(GamePanel panel) {
        this.panel = panel;
    }

    @Override
    public void keyTyped(KeyEvent e ) {

    }

    // 監聽鍵盤移動
    @Override
    public void keyPressed(KeyEvent e) {
        if(panel == null) return;
        ActionMove move = new ActionMove();

        List<Point> list = panel.list;

        Point head = new Point(list.get(0));

        int keyCode = e.getKeyCode();

        if(!panel.isFailed){
            if(KeyEvent.VK_SPACE == keyCode){
                panel.isStart = !panel.isStart;
                panel.repaint();
            }
            switch (keyCode){
                case KeyEvent.VK_UP:
                    move.moveUP(head , list);
                    panel.repaint();
                    move.eatFood(panel.food , list);
                    panel.repaint();
                    panel.fx = "U";
                    break;
                case KeyEvent.VK_DOWN:
                    move.moveDown(head , list);
                    panel.repaint();
                    move.eatFood(panel.food , list);
                    panel.repaint();
                    panel.fx = "D";
                    break;
                case KeyEvent.VK_RIGHT:
                    move.moveRight(head , list);
                    panel.repaint();
                    move.eatFood(panel.food , list);
                    panel.repaint();
                    panel.fx = "R";
                    break;
                case KeyEvent.VK_LEFT:
                    move.moveLeft(head , list);
                    panel.repaint();
                    move.eatFood(panel.food , list);
                    panel.repaint();
                    panel.fx = "L";
                    break;
                default:
                    break;
            }
            if(move.isFailed(list)){
                panel.isFailed = true;
                panel.repaint();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    // 監聽定時器 移動
    @Override
    public void actionPerformed(ActionEvent e) {
        if(panel == null) return;
        if(panel.isStart && !panel.isFailed){
            ActionMove move = new ActionMove();

            List<Point> list = panel.list;
            Point head = new Point(list.get(0));
            String fx = panel.fx;

            switch(fx){
                case "U":
                    move.moveUP(head , list);
                    break;
                case "D":
                    move.moveDown(head , list);
                    break;
                case "R":
                    move.moveRight(head , list);
                    break;
                case "L":
                    move.moveLeft(head , list);
                    break;
                default:
                    break;
            }
            panel.repaint();
        }
    }


}
