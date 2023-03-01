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
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author hpG42
 */
public class RegisterUser {
     
    public static void main(String[] args) {
        
    //TODO code application logic here
        JFrame j = new JFrame("JFrame Pertamamku");
        
        JLabel nama = new JLabel();
        nama.setText("Nama");
        nama.setBounds(50, 100, 100, 30);
        j.add(nama);
        
        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(50, 150, 100, 30);
        j.add(username);
        
        JLabel password = new JLabel();
        password.setText("Password");
        password.setBounds(50, 200, 100, 30);
        j.add(password);
        
        JLabel email = new JLabel();
        email.setText("Email");
        email.setBounds(50, 250, 100, 30);
        j.add(email);
        
        JLabel nohp = new JLabel();
        nohp.setText("No HP");
        nohp.setBounds(50, 300, 100, 30);
        j.add(nohp);
        
        JCheckBox hobi = new JCheckBox();
        hobi.setText("Hobi");
        hobi.setBounds(50, 350, 100, 30);
        
        JTextArea alamat = new JTextArea();
        alamat.setText("Alamat");
        alamat.setBounds(50, 400, 100, 30);
        
        JTextField namaTxt = new JTextField();
        namaTxt.setBounds(150, 100, 200, 30);
        j.add(namaTxt);
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(150, 150, 200, 30);
        j.add(usernameTxt);
        
        JPasswordField passwordTxt = new JPasswordField();
        passwordTxt.setBounds(150, 200, 200, 30);
        j.add(passwordTxt);
        
        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(150, 250, 200, 30);
        j.add(emailTxt);
        
        JTextField nohpTxt = new JTextField();
        nohpTxt.setBounds(150, 300, 200, 30);
        j.add(nohpTxt);
        
        JButton registerButton = new JButton();
        registerButton.setText("Login");
        registerButton.setBounds(150, 350, 100, 50);
        j.add(registerButton);
        
        JTextArea testTxt = new JTextArea();
        testTxt.setBounds(100, 400, 200, 200);
        j.add(testTxt);
                
        j.setSize(800, 800);
        j.setLayout(null);
        j.setVisible(true);
    }  
}
