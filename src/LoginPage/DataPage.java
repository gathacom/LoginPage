package LoginPage;

import javax.swing.*;
import java.awt.*;

public class DataPage extends JFrame{
    public JLabel namaLabel;
    public JLabel nimLabel;
    public JLabel kelasLabel;
    public JPanel panel;
    private String nama, nim, kelas;

    public DataPage() {

        JFrame frameData = new JFrame("Output Data");
        frameData.setPreferredSize(new Dimension(350,300));
        frameData.setResizable(false);
        frameData.add(panel);
        frameData.pack();
        frameData.setVisible(true);
        frameData.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frameData.setLocationRelativeTo(null);

    }
        public void setNama(String nama) {
            this.nama = nama;
            namaLabel.setText("Nama: " + nama);
        }

        public void setNim(String nim) {
            this.nim = nim;
            nimLabel.setText("NIM: " + nim);
        }

        public void setKelas(String kelas) {
            this.kelas = kelas;
            kelasLabel.setText("Kelas: " + kelas);
        }

        public String getNama() {
            return nama;
        }

        public String getNim() {
            return nim;
        }

        public String getKelas() {
            return kelas;
        }



}
