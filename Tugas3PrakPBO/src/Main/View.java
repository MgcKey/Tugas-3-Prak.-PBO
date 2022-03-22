
package Main;
import Bidang.PersegiPanjang;
import Ruang.Balok;
import javax.swing.*;
import java.awt.event.*;

class View extends JFrame implements ActionListener {
    double panjang, lebar, tinggi;
    JLabel lpanjang;
    JLabel llebar;
    JLabel ltinggi;
    JLabel lhasil;
    JLabel lluas;
    JLabel lkeliling;
    JLabel lvolume;
    JLabel lluasPermukaan;
    JTextField fpanjang;
    JTextField flebar;
    JTextField ftinggi;
    JButton btnhitung; 
    JButton btnreset;
    public View() {
        
        setTitle("Kalkulator Balok");
        setSize(400, 450);
        setDefaultCloseOperation(3);
        JLabel ltitle = new JLabel("Kalkulator Balok");
        lpanjang = new JLabel("Panjang");
        fpanjang = new JTextField();
        llebar = new JLabel("Lebar");
        flebar = new JTextField();
        ltinggi = new JLabel("Tinggi");
        ftinggi = new JTextField();
        btnhitung = new JButton("Hitung");
        btnhitung.addActionListener(this);
        btnreset = new JButton("Reset");
        btnreset.addActionListener(this);
        lhasil = new JLabel("Hasil :");
        lluas = new JLabel();
        lkeliling = new JLabel();
        lvolume = new JLabel();
        lluasPermukaan = new JLabel();
        
        setLayout(null);
        add(ltitle);
        add(lpanjang);
        add(fpanjang);
        add(llebar);
        add(flebar);
        add(ltinggi);
        add(ftinggi);
        add(btnhitung);
        add(btnreset);
        add(lhasil);
        add(lluas);
        add(lkeliling);
        add(lvolume);
        add(lluasPermukaan);
        
        setVisible(true);
        setLocationRelativeTo(null);
        ltitle.setBounds(140, 10, 120, 20);
        lpanjang.setBounds(60, 60, 100, 20);
        fpanjang.setBounds(140, 60, 180, 20);
        llebar.setBounds(60, 90, 100, 20);
        flebar.setBounds(140, 90, 180, 20);
        ltinggi.setBounds(60, 120, 100, 20);
        ftinggi.setBounds(140, 120, 180, 20);
        btnhitung.setBounds(80, 160, 100, 20);
        btnreset.setBounds(210, 160, 100, 20);
        lhasil.setBounds(60, 220, 280, 20);
        lluas.setBounds(60, 260, 280, 20);
        lkeliling.setBounds(60, 300, 280, 20);
        lvolume.setBounds(60, 340, 280, 20);
        lluasPermukaan.setBounds(60, 380, 280, 20);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == btnhitung){
            if(fpanjang.getText().equals("") || flebar.getText().equals("") || ftinggi.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Terdapat inputan yang kosong");
            }
            else{
                try{
                    panjang = Double.valueOf(fpanjang.getText());
                    lebar = Double.valueOf(flebar.getText());
                    tinggi = Double.valueOf(ftinggi.getText());
                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjang,lebar,tinggi);
                    Balok balok = new Balok(panjang,lebar,tinggi);
                    lluas.setText("Luas persegi panjang : " + persegiPanjang.luas());
                    lkeliling.setText("Keliling persegi panjang : " + persegiPanjang.keliling());
                    lvolume.setText("Volume balok : " + balok.volume());
                    lluasPermukaan.setText("Luas permukaan balok : " + balok.luasPermukaan());
                }catch(NumberFormatException error){
                    JOptionPane.showMessageDialog(null, error.getMessage()); 
                }
            }
        }
        
        if(evt.getSource() == btnreset){
            fpanjang.setText("");
            flebar.setText("");
            ftinggi.setText("");
            lluas.setText("");
            lkeliling.setText("");
            lvolume.setText("");
            lluasPermukaan.setText("");
        }
    }
     
   
}
