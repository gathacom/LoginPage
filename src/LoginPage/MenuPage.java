package LoginPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MenuPage extends JFrame {
    private JTextField nameField;
    private JPanel panel2;
    private JTextField nimField;
    private JComboBox classCB;
    private JButton submitButton;
    private JButton logoutButton;
    private DataPage dataPage;

    public MenuPage(){
        super("Menu Page");
        JFrame frameMenu = new JFrame("Menu Page");
        frameMenu.setPreferredSize(new Dimension(350,300));
        frameMenu.setResizable(false);
        //add panel
        frameMenu.add(panel2);
        frameMenu.pack();
        frameMenu.setLocationRelativeTo(null);
        frameMenu.setVisible(true);
        frameMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        logoutButton.addActionListener(this::actionPerformed);
        submitButton.addActionListener(this::actionPerformed);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==logoutButton){
            LoginPage loginPage = new LoginPage();
        } else if (e.getSource()==submitButton) {
            dispose();
            dataPage = new DataPage();

            String nama = nameField.getText();
            String nim = nimField.getText();
            String kelas = (String)classCB.getSelectedItem();

            DataPage dataPage = new DataPage();
            dataPage.setNama(nama);
            dataPage.setNim(nim);
            dataPage.setKelas(kelas);

            dataPage.setVisible(true);
        }
    }
}
