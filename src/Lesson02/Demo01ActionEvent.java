package Lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

public class Demo01ActionEvent {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button1 = new Button("start");
        Button button2 = new Button("stop");

        frame.setSize(100,100);
        frame.setLayout(new GridLayout());

        SimpleListener lsn = new SimpleListener();

        // 觸發返回指令，沒寫會使用默認的
        // 實現多個按鈕共用一個監聽器
        button1.setActionCommand("start");
        button2.setActionCommand("stop");

        button1.addActionListener(lsn);
        button2.addActionListener(lsn);

        frame.add(button1);
        frame.add(button2);

        frame.setVisible(true);
        windowClose(frame);

    }
    // 關閉視窗事件
    private static void windowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
// 監聽事件
class SimpleListener implements ActionListener{
    static boolean isAction = false;
    @Override
    public void actionPerformed(ActionEvent e) {
        String event = e.getActionCommand();
        System.out.println(event);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("aaa");
//    }
}
