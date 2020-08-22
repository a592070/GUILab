package Lesson04;

import javax.swing.*;
import java.awt.*;

public class Demo01Swing {

    // init();
    public void init(){
        JFrame frame = new JFrame("title");
        frame.setVisible(true);
        frame.setBounds(100,100,500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setBackground(Color.PINK);    // 無法改變背景色
        // 使用容器，在改變容器顏色
        Container contentPane = frame.getContentPane();
        contentPane.setBackground(Color.YELLOW);


        JLabel label = new JLabel("text");
        frame.add(label);
        label.setHorizontalAlignment(SwingConstants.CENTER);




    }

    public static void main(String[] args) {
        new Demo01Swing().init();

    }
}
