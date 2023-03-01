/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author hpG42
 */
public class RegisterUser {
     
    public static void main(String[] args) {
        
    //TODO code application logic here
        JFrame j = new JFrame("JFrame Pertamaku");
        
        JLabel nama = new JLabel();
        nama.setText("Nama");
        nama.setBounds(50, 100, 100, 30);
        j.add(nama);
        
        JLabel jekel = new JLabel();
        jekel.setText("Jenis Kelamin");
        jekel.setBounds(50, 150, 100, 30);
        j.add(jekel);
        
        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(50, 200, 100, 30);
        j.add(username);
        
        JLabel password = new JLabel();
        password.setText("Password");
        password.setBounds(50, 250, 100, 30);
        j.add(password);
        
        JLabel email = new JLabel();
        email.setText("Email");
        email.setBounds(50, 300, 100, 30);
        j.add(email);
        
        JLabel nohp = new JLabel();
        nohp.setText("No HP");
        nohp.setBounds(50, 350, 100, 30);
        j.add(nohp);
        
        JLabel alamat = new JLabel();
        alamat.setText("Alamat");
        alamat.setBounds(50, 400, 100, 30);
        j.add(alamat);
        
        JLabel hobi = new JLabel();
        hobi.setText("Hobi");
        hobi.setBounds(50, 500, 100, 30);
        j.add(hobi);
        
        JTextField namaTxt = new JTextField();
        namaTxt.setBounds(150, 100, 200, 30);
        j.add(namaTxt);
        
        JRadioButton jekelTxt = new JRadioButton();
        jekelTxt.setText("Laki-laki");
        jekelTxt.setBounds(150, 150, 100, 30);
        j.add(jekelTxt);
        
        JRadioButton jekel1Txt = new JRadioButton();
        jekel1Txt.setText("Perempuan");
        jekel1Txt.setBounds(250, 150, 100, 30);
        j.add(jekel1Txt);
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(150, 200, 200, 30);
        j.add(usernameTxt);
        
        JPasswordField passwordTxt = new JPasswordField();
        passwordTxt.setBounds(150, 250, 200, 30);
        j.add(passwordTxt);
        
        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(150, 300, 200, 30);
        j.add(emailTxt);
        
        JTextField nohpTxt = new JTextField();
        nohpTxt.setBounds(150, 350, 200, 30);
        j.add(nohpTxt);
        
        JTextArea testTxt = new JTextArea();
        testTxt.setBounds(150, 400, 200, 100);
        j.add(testTxt);
        
        JCheckBox hobiTxt = new JCheckBox();
        hobiTxt.setText("Bernyanyi");
        hobiTxt.setBounds(150, 450, 200, 30);
        j.add(hobiTxt);
        
        JCheckBox hobi1Txt = new JCheckBox();
        hobi1Txt.setText("Bermain Gitar");
        hobi1Txt.setBounds(150, 480, 200, 30);
        j.add(hobi1Txt);
        
        JCheckBox hobi2Txt = new JCheckBox();
        hobi2Txt.setText("Berenang");
        hobi2Txt.setBounds(150, 510, 200, 30);
        j.add(hobi2Txt);
        
        JCheckBox hobi3Txt = new JCheckBox();
        hobi3Txt.setText("Travelling");
        hobi3Txt.setBounds(150, 540, 200, 30);
        j.add(hobi3Txt);
        
        JButton registerButton = new JButton();
        registerButton.setText("Register");
        registerButton.setBounds(150, 700, 200, 30);
        j.add(registerButton);
             
        j.setSize(800, 800);
        j.setLayout(null);
        j.setVisible(true);
    }  
}
