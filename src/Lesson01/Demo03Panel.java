package Lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// Plane 可以看成一個空間，但是不能單獨存在
public class Demo03Panel {
    public static void main(String[] args) {
        Frame frame = new Frame("title");

        // 布局的概念
        Panel panel = new Panel();

        // 設置布局
        frame.setLayout(null);

        // 座標
        frame.setBounds(300,300,500,500);
        frame.setBackground(Color.BLACK);

        // panel 設置座標，相對於frame
        panel.setBounds(50,50,400,400);

        panel.setBackground(Color.WHITE);

        // frame.add(Component)
        frame.add(panel);

        frame.setVisible(true);

        // 監聽事件，監聽窗口關閉事件 System.exit(0)
        // 適配器模式，不想重寫WindowListener的所有方法，只想實現部分方法
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }
}
