package LoginPage;

import javax.swing.*;
import java.awt.*;

public class DataPage extends JFrame{
    public JLabel namaLabel;
    public JLabel nimLabel;
    public JLabel kelasLabel;
    public JPanel panel3;
    private String nama, nim, kelas;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }


    public DataPage(){
        JFrame frameData = new JFrame();
        frameData.setPreferredSize(new Dimension(350,300));
        frameData.setResizable(false);
        frameData.add(panel3);
        frameData.pack();
        frameData.setLocationRelativeTo(null);
        frameData.setVisible(true);
        frameData.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void setData(String nama,String nim, String kelas){
        namaLabel.setText("Nama      : " + nama);
        namaLabel.setText("NIM       : " + nim);
        namaLabel.setText("Kelas     : " + kelas);
    }
}
