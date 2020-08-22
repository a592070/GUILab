package Lesson01;

import java.awt.*;

public class Assignment01 {
    /** 做成下面布局格式
     *
     *   ------------------------
     *  \   \               \   \
     *  \   \---------------\   \
     *  \   \               \   \
     *  \------------------------
     *  \   \       \       \   \
     *  \   \---------------\   \
     *  \   \       \       \   \
     *  -------------------------
     * */
    public static void main(String[] args) {
        Frame frame = new Frame("title");

        frame.setSize(600,500);
        frame.setLocation(300,300);
        frame.setVisible(true);

        frame.setLayout(new GridLayout(2,1));


        // 以Panel1、Panel3 為外層 嵌套Panel3、Panel4
        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2,1));
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2,2));

        panel1.setBackground(Color.GRAY);
        panel2.setBackground(Color.LIGHT_GRAY);
        panel3.setBackground(Color.WHITE);
        panel4.setBackground(Color.PINK);


        panel1.add(new Button("1123445"),BorderLayout.EAST);
        panel1.add(new Button("2"),BorderLayout.WEST);

        panel1.add(panel2 , BorderLayout.CENTER);


        panel3.add(new Button("5") , BorderLayout.EAST);
        panel3.add(new Button("6") , BorderLayout.WEST);

        panel3.add(panel4 , BorderLayout.CENTER);


        panel2.add(new Button("3") , BorderLayout.NORTH);
        panel2.add(new Button("4") , BorderLayout.SOUTH);

        panel4.add(new Button("7"));
        panel4.add(new Button("8"));
        panel4.add(new Button("9"));
        panel4.add(new Button("10"));


        frame.add(panel1);
        frame.add(panel3);


    }
}
