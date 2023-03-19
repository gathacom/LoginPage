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
        // Set up the login window
        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setPreferredSize(new Dimension(350, 300));
        frame.setResizable(false);
        setLocationRelativeTo(null);

        // add panel
        frame.add(panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //add action listener to login button
        loginButton.addActionListener(this);

    }

    //handle button when clicks
    public void actionPerformed(java.awt.event.ActionEvent e) {
        String usernameValue = usernameField.getText();
        String passwordValue = new String(passwordField.getPassword());

        //check if the username and password are correct
        if (usernameValue.equals("yogapsb")&&passwordValue.equals("yogapsb")){
            dispose();
            MenuPage menuPage = new MenuPage();

        }
        else {
            JOptionPane.showMessageDialog(panel1, " Invalid Username or Password");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginPage login = new LoginPage();

        });
    }
}
