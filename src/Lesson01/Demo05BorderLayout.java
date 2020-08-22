package Lesson01;

import java.awt.*;

public class Demo05BorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("title");

        Button button1 = new Button("Click1");
        Button button2 = new Button("Click2");
        Button button3 = new Button("Click3");
        Button button4 = new Button("Click4");
        Button button5 = new Button("Click5");


        frame.setSize(600,500);
        frame.setVisible(true);


        // 東南西北中 BorderLayout
        frame.add(button1 , BorderLayout.EAST);
        frame.add(button2 , BorderLayout.SOUTH);
        frame.add(button3 , BorderLayout.WEST);
        frame.add(button4 , BorderLayout.NORTH);
        frame.add(button5 , BorderLayout.CENTER);

    }
}
