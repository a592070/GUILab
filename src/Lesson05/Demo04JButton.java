package Lesson05;

import javax.swing.*;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Demo04JButton extends JFrame {
    private Icon iconTurnOff;
    private Icon iconTurnOn;

    public Demo04JButton() {
        Container contentPane = this.getContentPane();

        URL turnOff = Demo04JButton.class.getResource("/res/icons8-toggle-off-40.png");
        URL turnOn = Demo04JButton.class.getResource("/res/icons8-toggle-on-40.png");

        iconTurnOff = new ImageIcon(turnOff);
        iconTurnOn = new ImageIcon(turnOn);


        // 單選框
        JRadioButton radioButton1 = new JRadioButton(iconTurnOff);
        JRadioButton radioButton2 = new JRadioButton(iconTurnOff);
        JRadioButton radioButton3 = new JRadioButton(iconTurnOff);

        radioButton1.addActionListener(new ButtonListener());
        radioButton2.addActionListener(new ButtonListener());
        radioButton3.addActionListener(new ButtonListener());

        // 分組實現 單選功能
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        contentPane.add(radioButton1, BorderLayout.NORTH);
        contentPane.add(radioButton2, BorderLayout.CENTER);
        contentPane.add(radioButton3, BorderLayout.SOUTH);


        setVisible(true);
        setBounds(50, 50, 500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo04JButton();
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JRadioButton button = (JRadioButton) e.getSource();

            // 選擇時 啟用 Icon
            button.setSelectedIcon(iconTurnOn);
        }
    }
}
