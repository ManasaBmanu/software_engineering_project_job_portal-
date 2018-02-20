/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package jobportal;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
public class EmployerHome extends JFrame implements ActionListener {
    private JLabel label1;
    public static JLabel name;
    public JPanel panel,panel1,panel2;
    private JButton button1,button2;
    private Font fnt;
    
    
    EmployerHome()
    {
        fnt = new Font("Times New Roman",Font.BOLD,18);
        label1=new JLabel("WELCOME   ");
        label1.setFont(fnt);
        name= new JLabel();
        name.setFont(fnt);
        button1=new JButton("SELECT EMPLOYEE");
        panel=new JPanel(new GridLayout(4,1));
         panel1=new JPanel();
         panel2=new JPanel();
        panel1.add(label1);
        panel1.add(name);
        panel2.add(button1);
        panel.add(panel1);
        panel.add(panel2); 
        add(panel);
        button1.addActionListener(this);
       
        
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==button1)
        {
            new JobSelect();
        }
       
    }
}
