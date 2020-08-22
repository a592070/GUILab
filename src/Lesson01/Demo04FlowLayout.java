package Lesson01;

import java.awt.*;

public class Demo04FlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("title");

        Button button1 = new Button("Click1");
        Button button2 = new Button("Click2");
        Button button3 = new Button("Click3");

        // 設置為流式布局FlowLayout
//        frame.setLayout(new FlowLayout());
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));


        frame.setSize(600,500);
        frame.setVisible(true);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);


    }
}
