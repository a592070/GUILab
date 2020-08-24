package Lesson07;

import java.awt.*;
import java.util.List;
import java.util.Random;

public class ActionMove {
    Point pop;
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
    public void eatFood(Point food , List<Point> list){
        Point head  = list.get(0);
        if(head.equals(food)){
            list.add(list.size(), pop);
            for (Point point : list) {
                while(food.equals(point)){
                    food.x = 25 + 25* new Random().nextInt(34);
                    food.y = 75 + 25* new Random().nextInt(24);
                }
            }
        }
    }
    public Point foodLocation(Point food){
        food.x = 25 + 25* new Random().nextInt(34);
        food.y = 75 + 25* new Random().nextInt(24);
        return food;
    }
}
