package Lesson07;

import javax.swing.*;
import java.awt.*;

public class StartGame{

    public static void main(String[] args){
        JFrame frame = new JFrame();

        frame.add(new GamePanel());


        frame.setVisible(true);
        frame.setBounds(0,0,900,725);
        // 窗口大小固定
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
