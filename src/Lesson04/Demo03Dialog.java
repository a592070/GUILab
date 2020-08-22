package Lesson04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class Demo03Dialog extends JFrame {
    public void init(){
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(10,10,200,200);

        Container contentPane = this.getContentPane();
        contentPane.setBackground(Color.YELLOW);
        // 絕對布局 null，可以讓窗口大小固定不可變
        contentPane.setLayout(null);


        JLabel label = new JLabel("text");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label);

        JButton button = new JButton("click");
        button.setBounds(500,500,100,50);
        contentPane.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SimpleJDialog();
            }
        });
    }

    public static void main(String[] args) {
        new Demo03Dialog().init();
    }
}
class SimpleJDialog extends JDialog{
    public SimpleJDialog() {
        this.setVisible(true);
        this.setBounds(500,300,100,100);
        // defaultCloseOperation must be one of: DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE, or DISPOSE_ON_CLOSE
        // 默認就是 EXIT_ON_CLOSE 不需要特別設置
//        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container contentPane = this.getContentPane();
        contentPane.setLayout(null);
        contentPane.add(new JLabel("Dialog"));

    }
}
