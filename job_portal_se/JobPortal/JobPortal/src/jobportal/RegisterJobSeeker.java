/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobportal;
 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegisterJobSeeker extends JFrame implements ItemListener,ActionListener {
    private  JLabel blank,label,name,username,password,phonenum,email,qualification;
             JTextField tname,tusername,tphonenum,temail,tqualification;
    private JPasswordField tpassword;
    private JButton create,cancel;
    private JPanel p,panel,panel1,panel2,panel3,panel4,panel5,panel6,panel7;
    
    
   public RegisterJobSeeker()
    {
        name=new JLabel    ("NAME         ");
        username=new JLabel("CHOOSE USERNAME");
        password=new JLabel("CHOOSE PASSWORD");
        phonenum=new JLabel("PHONE NUMBER        ");
        email=new JLabel   ("EMAIL ADDRESS        ");
        qualification=new JLabel("QUALIFICATION         ");
        
        create=new JButton("Create");
        cancel=new JButton("Cancel");
        
        tname=new JTextField(30);
        tusername=new JTextField(30);
        tphonenum=new JTextField(30);
        temail=new JTextField(30);
        tqualification=new JTextField(30);
        Font f=new Font("Arial Unicode MS",Font.BOLD,18);
        
       name.setFont(f);
        tpassword=new JPasswordField(30);
        panel=new JPanel(new GridLayout(10,1));
        blank=new JLabel("");
        p=new JPanel();
        p.add(blank);
       panel. add(p);
        
        panel1=new JPanel(new FlowLayout());
        panel1.add(name);
        panel1.add(tname);
        panel.add(panel1);
        panel2=new JPanel(new FlowLayout());
        panel2.add(username);
        panel2.add(tusername);
        panel.add(panel2);
        panel3=new JPanel(new FlowLayout());
        panel3.add(password);
        panel3.add(tpassword);
        panel.add(panel3);
        panel4 =new JPanel(new FlowLayout());
        panel4.add(phonenum);
        panel4.add(tphonenum);
        panel.add(panel4);
        panel5=new JPanel();
        panel5.add(email);
        panel5.add(temail);
        panel.add(panel5);
        panel6=new JPanel();
        panel6.add(qualification);
        panel6.add(tqualification);
        panel.add(panel6);
        panel7=new JPanel();
        panel7.add(create);
        panel7.add(cancel);
        panel.add(panel7);
         event e=new event();
         create.addActionListener(e);  
         
        event1  e1 = new event1();
        cancel.addActionListener(e1);
        add(panel);
              
        
        
        
        
        setTitle("Registration");
        setSize(600,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
   
    boolean checkPhone(){
        if(tphonenum.getText().length()==10){
            return true;
        }
        else return false;
    }
    
    boolean CheckEmail(){
        if(temail.getText().contains(".com")){
          return true;  
        }
        else return false;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      public class event1 implements ActionListener{
            public void actionPerformed(ActionEvent e1)
            {
              //WelcomeFrame w=new WelcomeFrame();  
              setVisible(false);
            }
       
}
       public class event implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            
            boolean flag;
            boolean phsyntax,esyntax;
            phsyntax=checkPhone();
            esyntax=CheckEmail();
            if(!phsyntax)
                JOptionPane.showMessageDialog(null, "Invalid Phone Number", "Error", JOptionPane.ERROR_MESSAGE);
            if(!esyntax)
                JOptionPane.showMessageDialog(null, "Invalid Email", "Error", JOptionPane.ERROR_MESSAGE);
            else if (phsyntax && esyntax){
              AddObject a =new AddObject();
                flag=a.existJobSeekerUser(tusername.getText());
                if(flag){
                a.Addj(tname.getText(),tusername.getText(),tphonenum.getText(),tpassword.getPassword(),temail.getText(),tqualification.getText());
                setVisible(false);  
            }
            
             //JobSeekerHomePage h=new JobSeekerHomePage();
             
            }
         }
       
       }
}