package Lesson01;

import java.awt.*;

public class Demo06GridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("title");

        Button button1 = new Button("Click1");
        Button button2 = new Button("Click2");
        Button button3 = new Button("Click3");
        Button button4 = new Button("Click4");
        Button button5 = new Button("Click5");


        frame.setSize(600,500);
        frame.setVisible(true);

        frame.setLayout(new GridLayout(3,2));

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);

        // Java函數 自動布局
        frame.pack();
    }
}
