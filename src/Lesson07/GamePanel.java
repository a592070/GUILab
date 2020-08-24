package Lesson07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.Iterator;
import java.util.List;

public class GamePanel extends JPanel {
    int length; // max length 34*24=816
    List<Point> list;
    String fx;

    boolean isStart = false;
    boolean isFailed = false;

    Timer timer ;

    Point food;

    public void init(){

        list = new ArrayList<>();
        list.add(new Point(200 , 300));
        list.add(new Point(175 , 300));
        list.add(new Point(150 , 300));

        length = list.size();

        fx = "R";

        food = new Point(450 , 375);
    }

    public GamePanel() {
        this.init();
        this.setFocusable(true);    // 獲得焦點

        EventListener listener = new GameActionListener(this);
        this.addKeyListener((KeyListener) listener);
        timer = new Timer(100 ,null);
        timer.addActionListener((ActionListener) listener);
        timer.start();
    }

    // 控制面板，所有物件都使用這個方法繪製
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);    // ui.update() 達到清屏作用

        this.setBackground(Color.LIGHT_GRAY);
        g.fillRect(25,75,850,600);  // 默認遊戲畫面大小 850/25=34 , 600/25=24

        Point first = list.get(0);
        ObjectData.head.paintIcon(this, g, first.x, first.y);
        for (int i = 1; i < list.size(); i++) {
            Point next = list.get(i);
            ObjectData.body.paintIcon(this, g, next.x, next.y);
        }

        ObjectData.food.paintIcon(this , g , food.x, food.y);

        if(isStart == false){
            g.setColor(Color.WHITE);
            g.setFont(new Font("微軟正黑體" , Font.BOLD , 40));
            g.drawString("Press SPACE to Start" , 225,350);
        }

        if(isFailed == true){
            g.setColor(Color.WHITE);
            g.setFont(new Font("微軟正黑體" , Font.BOLD , 40));
            g.drawString("You are Failed" , 250,350);
        }
    }
}
