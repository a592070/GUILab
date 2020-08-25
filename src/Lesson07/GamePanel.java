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
    int score;

    List<Point> list;
    String fx;  // 自動移動方向

    boolean isStart = false;
    boolean isFailed;

    Timer timer ;
    int speed;

    Point food;

    EventListener listener;

    // 初始化
    public void init(){
        isFailed = false;

        // 初始蛇
        list = new ArrayList<>();
        list.add(new Point(200 , 300));
        list.add(new Point(175 , 300));
        list.add(new Point(150 , 300));

        length = list.size();
        score = 0;

        fx = "R";
        speed = 300;

        food = new Point(450 , 375);
    }

    public GamePanel() {
        this.init();

        this.setFocusable(true);    // 獲得焦點
        listener = new GameActionListener(this);
        this.addKeyListener((KeyListener) listener);
        timer = new Timer(speed ,(ActionListener) listener);
        timer.start();
    }


    // 控制面板，所有物件都使用這個方法繪製
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);    // ui.update() 達到清屏作用

        this.setBackground(Color.LIGHT_GRAY);
        g.fillRect(25,75,850,600);  // 默認遊戲畫面大小 850/25=34 , 600/25=24

        // 繪製food
        ObjectData.food.paintIcon(this , g , food.x, food.y);

        // 繪製 snake
        Point first = list.get(0);

        switch (fx){
            case "U":
                ObjectData.headUp.paintIcon(this, g, first.x, first.y);
                break;
            case "D":
                ObjectData.headDown.paintIcon(this, g, first.x, first.y);
                break;
            case "L":
                ObjectData.headLeft.paintIcon(this, g, first.x, first.y);
                break;
            case "R":
                ObjectData.headRight.paintIcon(this, g, first.x, first.y);
                break;
        }


        for (int i = 1; i < list.size(); i++) {
            Point next = list.get(i);
            ObjectData.body.paintIcon(this, g, next.x, next.y);
        }


        if(isStart == false){
            g.setColor(Color.WHITE);
            g.setFont(new Font("LetterOMatic!" , Font.BOLD , 45)); // Expo M
            g.drawString("Press  SPACE  to Start" , 200,400);
        }

        if(isFailed == true){
            g.setColor(Color.WHITE);
            g.setFont(new Font("Ink Free" , Font.BOLD , 60));   // Cracked Johnnie CreepyGirl
            g.drawString("You are Failed" , 200,300);
            g.drawString("Press SPACE to ReStart" ,100 , 400);
        }

        // 得分
        g.setColor(Color.BLUE);
        g.setFont(new Font("Alien Encounters" , Font.BOLD , 25));
        g.drawString("Snake size:  "+list.size() , 25,50);

        g.setColor(Color.BLUE);
        g.setFont(new Font("Alien Encounters" , Font.BOLD , 25));
        g.drawString("Score:  "+score , 500,50);
    }
}
