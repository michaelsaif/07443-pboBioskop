import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Color;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class no4GUI extends JFrame{

    private JButton btn_tambah1;
    private JButton btn_tambah3;
    private JButton btn_kurang1;
    private JButton btn_kurang3;
    private JButton btn_kali2;
    private JLabel lbl_angka;
    private JPanel formPanel;
    private int num=0;
    private String numstr;
    private Font mainFont=new Font("Times New Roman",Font.BOLD,30);
    public no4GUI()
    {
        setTitle("Kalkulator Sederhana");
        setSize(400,600);
        setLayout(null);
        setVisible(true);
        
        form();
        event();
    }
    public void form()
    {
        numstr = String.valueOf(num);
        
        lbl_angka=new JLabel(numstr);
        lbl_angka.setBounds(161,30, 100,30);
        lbl_angka.setFont(mainFont);
        add(lbl_angka);
        
        btn_tambah1=new JButton("+1");
        btn_tambah1.setBounds(35, 60, 100,30);
        add(btn_tambah1);
            
         btn_tambah3=new JButton("+3");
        btn_tambah3.setBounds(200, 60, 100,30);
        add(btn_tambah3);
        
         btn_kurang1=new JButton("-1");
        btn_kurang1.setBounds(35, 130, 100,30);
        add(btn_kurang1);
        
         btn_kurang3=new JButton("-3");
        btn_kurang3.setBounds(200,130, 100,30);
        add(btn_kurang3);
        
        btn_kali2=new JButton("x2");
        btn_kali2.setBounds(120,200, 100,30);
        add(btn_kali2);
         
    }
    
    public static void main(String[] args) {
       no4GUI GUI =new no4GUI();
       GUI.setVisible(true);
    }

    private void event() {
     btn_tambah1.addActionListener((e)->{
         num+=1;
         String numstr=String.valueOf(num);
         lbl_angka.setText(numstr);
     });
     btn_tambah3.addActionListener((e)->{
         num+=3;
         String numStr=String.valueOf(num);
         lbl_angka.setText(numStr);     
     });
     btn_kurang1.addActionListener((e)->{
         num-=1;
        if(num < 0){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan program", "", JOptionPane.ERROR_MESSAGE);
            num = 0;
            String numStr=String.valueOf(num);
            lbl_angka.setText(numStr);
        }
        else{
            String numStr=String.valueOf(num);
            lbl_angka.setText(numStr);
        }
     });
     
     btn_kurang3.addActionListener((e)-> {
         num-=3;
         if(num < 0){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan program","", JOptionPane.ERROR_MESSAGE);
            num = 0;
            String numStr=String.valueOf(num);
            lbl_angka.setText(numStr);
        }
        else{
            String numStr=String.valueOf(num);
            lbl_angka.setText(numStr);
        }
     });
     btn_kali2.addActionListener((e)-> {
         num*=2;
         String numStr=String.valueOf(num);
         lbl_angka.setText(numStr);
     });
     
        
        
    }
}