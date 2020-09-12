package Lesson07;

import java.awt.*;
import java.util.List;
import java.util.Random;

public class ActionMove {
    Point pop;
    GamePanel panel;

    public ActionMove(GamePanel panel) {
        this.panel = panel;
    }

    // 取出最後一個，加上移動座標後放入第一位
    public void moveUP(Point head , List<Point> list){
        pop = list.remove(list.size()-1);
        head.y -= 25;
        if(head.y < 75) head.y = 650;
        list.add(0 , head);
    }
    public void moveDown(Point head , List<Point> list){
        pop = list.remove(list.size()-1);
        head.y += 25;
        if(head.y > 650) head.y = 75;
        list.add(0 , head);
    }
    public void moveLeft(Point head , List<Point> list){
        pop = list.remove(list.size()-1);
        head.x -= 25;
        if(head.x < 25) head.x = 850;
        list.add(0 , head);
    }
    public void moveRight(Point head , List<Point> list){
        pop = list.remove(list.size()-1);
        head.x += 25;
        if(head.x > 850) head.x = 25;
        list.add(0 , head);
    }

    // 碰撞身體則失敗
    public boolean isFailed(List<Point> list){
        Point head  = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(head.equals(list.get(i))) return true;
        }
        return false;
    }

    // 吃到食物
    public void eatFood(List<Point> list){
        Point head  = list.get(0);
        Point food = panel.food;
        if(head.equals(food)){
            list.add(list.size(), pop);
            for (Point point : list) {
                while(food.equals(point)){
                    food.x = 25 + 25* new Random().nextInt(34);
                    food.y = 75 + 25* new Random().nextInt(24);
                }
            }
            panel.score += 10;
            addSpeed(panel.score);
        }
    }
    public Point foodLocation(Point food){
        food.x = 25 + 25* new Random().nextInt(34);
        food.y = 75 + 25* new Random().nextInt(24);
        return food;
    }
    public void addSpeed(int score){
        switch (score){
            case 10:
                panel.speed*=0.9;
                panel.timer.setDelay(panel.speed);
                break;
            case 20:
                panel.speed*=0.9;
                panel.timer.setDelay(panel.speed);
                break;
            case 30:
                panel.speed*=0.9;
                panel.timer.setDelay(panel.speed);
                break;
            case 40:
                panel.speed*=0.9;
                panel.timer.setDelay(panel.speed);
                break;
            case 50:
                panel.speed*=0.9;
                panel.timer.setDelay(panel.speed);
                break;
            case 60:
                panel.speed*=0.9;
                panel.timer.setDelay(panel.speed);
                break;
            case 70:
                panel.speed*=0.9;
                panel.timer.setDelay(panel.speed);
                break;
            case 80:
                panel.speed*=0.9;
                panel.timer.setDelay(panel.speed);
                break;
            case 90:
                panel.speed*=0.9;
                panel.timer.setDelay(panel.speed);
                break;
            case 100:
                panel.speed*=0.9;
                panel.timer.setDelay(panel.speed);
                break;
            case 200:
                panel.speed*=0.9;
                panel.timer.setDelay(panel.speed);
                break;
            case 300:
                panel.speed*=0.9;
                panel.timer.setDelay(panel.speed);
                break;
            case 400:
                panel.speed*=0.9;
                panel.timer.setDelay(panel.speed);
                break;
            case 500:
                panel.speed*=0.9;
                panel.timer.setDelay(panel.speed);
                break;
            case 700:
                panel.speed*=0.9;
                panel.timer.setDelay(panel.speed);
                break;
            case 900:
                panel.speed*=0.9;
                panel.timer.setDelay(panel.speed);
                break;
            case 1200:
                panel.speed*=0.9;
                panel.timer.setDelay(panel.speed);
                break;
            case 1500:
                panel.speed*=0.9;
                panel.timer.setDelay(panel.speed);
                break;
            default:
                break;
        }
    }
}
