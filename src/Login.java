import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login {
    private JPanel panel1;
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton confirm;
    private JButton cancel;
    private JPanel loginPanel;
    private JLabel userLabel;
    private JLabel passwordLabel;

    public Login() {
        cancel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // 清空 TextField內容
                userTextField.setText("");
                passwordField.setText("");
            }
        });
        confirm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setBounds(0,0,600,400);
    }

}
