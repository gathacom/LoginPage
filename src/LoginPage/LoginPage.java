package LoginPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener{
    private JTextField usernameField;
    private JPanel panel1;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JFrame frame;
    public LoginPage() {
        frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(350, 300));
        frame.setResizable(false);

        // add panel
        frame.add(panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        loginButton.addActionListener(this::actionPerformed);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String usernameValue = usernameField.getText();
        String passwordValue = passwordField.getText();

        if (usernameValue.equals("yogapsb")&&passwordValue.equals("yogapsb")){
            JOptionPane.showMessageDialog(this, "Login Successful");
            MenuPage menu = new MenuPage();
            dispose();
        }
        else {
            JOptionPane.showMessageDialog(
                    null,
                    "Your username or password is invalid",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args) {
        LoginPage loginFrame = new LoginPage();
    }
}
