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

    public MenuPage(){
        JFrame frameMenu = new JFrame();

        frameMenu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameMenu.setPreferredSize(new Dimension(350,300));
        frameMenu.setResizable(false);

        //add panel
        frameMenu.add(panel1);
        frameMenu.pack();
        frameMenu.setLocationRelativeTo(null);
        frameMenu.setVisible(true);

        logoutButton.addActionListener(this::actionPerformed);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==logoutButton){
            LoginPage loginPage = new LoginPage();
        }
    }
}
