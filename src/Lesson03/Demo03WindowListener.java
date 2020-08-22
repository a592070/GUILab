package Lesson03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo03WindowListener {
    public static void main(String[] args) {
        new SimpleFrame03().loadFrame();
    }
}

class SimpleFrame03 extends Frame{


    public void loadFrame(){
        setTitle("Nothing Window");
        setBounds(100, 100, 700, 700);
        setVisible(true);



//        WindowAdapter windowAdapter = new WindowAdapter();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("close");
                setVisible(false);  // 隱藏窗口
                System.exit(0); // 退出
            }

            @Override
            public void windowActivated(WindowEvent e) {
                SimpleFrame03 frame = (SimpleFrame03) e.getSource();
                frame.setTitle("看我");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                SimpleFrame03 frame = (SimpleFrame03) e.getSource();
                frame.setTitle("不要走");
            }
        });
    }
}
