package LoginPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MenuPage extends JFrame {
    private JTextField nameField;
    private JPanel panel1;
    private JTextField nimField;
    private JComboBox classCB;
    private JButton submitButton;
    private JButton logoutButton;
    private JFrame frame;

    public MenuPage(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(350,300));
        frame.setResizable(false);

        //add panel
        frame.add(panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        logoutButton.addActionListener(this::actionPerformed);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==logoutButton){
            LoginPage loginPage = new LoginPage();
        }
    }
}
