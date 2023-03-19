package LoginPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener{
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JPanel panel1;

    public LoginPage() {
        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(350, 300));
        frame.setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        frame.setPreferredSize(new Dimension(350, 300));
        frame.setResizable(false);

        // add panel
        frame.add(panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        loginButton.addActionListener(this);

    }

    public void actionPerformed(java.awt.event.ActionEvent e) {
        String usernameValue = usernameField.getText();
        String passwordValue = new String(passwordField.getPassword());


        if (usernameValue.equals("yogapsb")&&passwordValue.equals("yogapsb")){
                // Login successful, dispose the login page window
            dispose();
            JOptionPane.showMessageDialog(panel1, "Login Successful");
            new MenuPage();
                // Show the main application window
        }
        else {
            JOptionPane.showMessageDialog(panel1, " Invalid Username or Password");
        }
    }
    public static void main(String[] args) {
        LoginPage loginFrame = new LoginPage();
    }
}
