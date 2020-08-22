package Lesson01;

import java.awt.*;

public class Demo01Frame {
    public static void main(String[] args) {

        Frame frame = new Frame("Title");
        // 窗口可見性
        frame.setVisible(true);

        frame.setSize(400,300);
        // 背景色
        frame.setBackground(Color.LIGHT_GRAY);

        // 左上角 (0,0)
        frame.setLocation(400,300);

        // 可變窗口大小
        frame.setResizable(false);



    }
}
