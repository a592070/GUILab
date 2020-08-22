package Lesson01;

import java.awt.*;

public class Demo02FrameList {
    public static void main(String[] args) {
        SimpleFrame frame1 = new SimpleFrame(100, 100, 200, 200, Color.blue);
        SimpleFrame frame2 = new SimpleFrame(300, 100, 200, 200, Color.GRAY);
        SimpleFrame frame3 = new SimpleFrame(100, 300, 200, 200, Color.PINK);
        SimpleFrame frame4 = new SimpleFrame(300, 300, 200, 200, Color.BLACK);

    }
}
class SimpleFrame extends Frame{
    // 窗口計數
    static int id = 0;

    public SimpleFrame(int x, int y, int w, int h, Color color) {
        super("SimpleFrame"+(++id));
        setBackground(color);
        setBounds(x, y, w, h);
        setVisible(true);
    }
}
