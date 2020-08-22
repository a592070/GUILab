package Lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo02Text {
    public static void main(String[] args) {
        // 只有啟動
        new SimpleFrame();
    }
}
class SimpleFrame extends Frame{
    public SimpleFrame(){
        TextField text = new TextField();
        TextField password = new TextField();
        add(text , BorderLayout.NORTH);
        add(password , BorderLayout.SOUTH);

        // 監聽文本輸入
        text.addActionListener(new SimpleListener02());

        password.addActionListener(new SimpleListener02());
        password.setEchoChar('*');


        pack();
        setVisible(true);
    }
}
class SimpleListener02 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField text = (TextField) e.getSource();
        String context = text.getText();
        System.out.println(context);

        // 清空 TextField內容
        text.setText("");
    }
}