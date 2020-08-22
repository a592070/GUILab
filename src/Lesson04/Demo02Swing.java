package Lesson04;

import javax.swing.*;
import java.awt.*;

public class Demo02Swing {
    public static void main(String[] args) {
        new SimpleJFrame01().init();
    }
}
class SimpleJFrame01 extends JFrame{
    public void init(){
        // 獲得一個容器
        Container contentPane = this.getContentPane();
        contentPane.setBackground(Color.YELLOW);

        JLabel label = new JLabel("text");
        this.add(label);

        // 標籤位置
        label.setHorizontalAlignment(SwingConstants.CENTER);

        this.setVisible(true);
        this.setBounds(10,10,200,200);
    }
}
