package Lesson07;

import javax.swing.*;
import javax.swing.plaf.IconUIResource;
import java.awt.*;
import java.net.URL;

public class ObjectData {
    public static URL headURLUp = ObjectData.class.getResource("/res/head2U.png");
    public static ImageIcon headUp = new ImageIcon(headURLUp);  // 25px, 25px

    public static URL headURLDown = ObjectData.class.getResource("/res/head2D.png");
    public static ImageIcon headDown = new ImageIcon(headURLDown);  // 25px, 25px

    public static URL headURLLeft = ObjectData.class.getResource("/res/head2L-1.png");
    public static ImageIcon headLeft = new ImageIcon(headURLLeft);  // 25px, 25px

    public static URL headURLRight = ObjectData.class.getResource("/res/head2R-1.png");
    public static ImageIcon headRight = new ImageIcon(headURLRight);  // 25px, 25px

    public static URL headURL = ObjectData.class.getResource("/res/head.png");
    public static ImageIcon head = new ImageIcon(headURL);  // 25px, 25px

    public static URL bodyURL = ObjectData.class.getResource("/res/body4.png");
    public static ImageIcon body = new ImageIcon(bodyURL);  // 25px, 25px

    public static URL foodURL = ObjectData.class.getResource("/res/food.png");
    public static ImageIcon food = new ImageIcon(foodURL);  // 25px, 25px

//    public Point headPoint = new Point(30,80);
//    public Point headPoint = new Point(30,80);

}
