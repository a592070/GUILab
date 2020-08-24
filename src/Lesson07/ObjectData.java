package Lesson07;

import javax.swing.*;
import javax.swing.plaf.IconUIResource;
import java.awt.*;
import java.net.URL;

public class ObjectData {
    public static URL headURL = ObjectData.class.getResource("/res/head.png");
    public static ImageIcon head = new ImageIcon(headURL);  // 25px, 25px

    public static URL bodyURL = ObjectData.class.getResource("/res/body.png");
    public static ImageIcon body = new ImageIcon(bodyURL);  // 25px, 25px

    public static URL foodURL = ObjectData.class.getResource("/res/food.png");
    public static ImageIcon food = new ImageIcon(foodURL);  // 25px, 25px

//    public Point headPoint = new Point(30,80);
//    public Point headPoint = new Point(30,80);

}
