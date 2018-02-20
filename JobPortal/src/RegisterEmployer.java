
package jobportal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


class RegisterEmployer extends JFrame implements ItemListener,ActionListener{
    private JLabel blank,label,name,username,password,phonenum,email;
    JTextField tname,tusername,tphonenum,temail;
    JPasswordField tpassword;
    private JButton create,cancel;
    private JPanel p,panel,panel1,panel2,panel3,panel4,panel5,panel6,panel7;

    public RegisterEmployer() {
        name=new JLabel    ("NAME         ");
        username=new JLabel("CHOOSE USERNAME");
        password=new JLabel("CHOOSE PASSWORD");
        phonenum=new JLabel("PHONE NUMBER        ");
        email=new JLabel   ("EMAIL ADDRESS        ");
        
        create=new JButton("Create");
        cancel=new JButton("Cancel");
        
        tname=new JTextField(30);
        tusername=new JTextField(30);
        tphonenum=new JTextField(30);
        temail=new JTextField(30);
       
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
       
       
        panel.add(panel6);
        panel7=new JPanel();
        panel7.add(create);
        panel7.add(cancel);
        panel.add(panel7);
        
        add(panel);  
        
        /*setTitle("Registration");
        setSize(600,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
                */
        
 
        create.addActionListener(this);
        cancel.addActionListener(this);
    }
    
    boolean checkPhone(){
        return tphonenum.getText().length()==10;
    }
    
    boolean CheckEmail(){
        return temail.getText().contains(".com");
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==create){
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
                    flag= a.existUser(tusername.getText());
                    if(flag)
                    {
                        a.Adde(tname.getText(),tusername.getText(),tphonenum.getText(),tpassword.getPassword(),temail.getText());
                        EmployerHome eh=new EmployerHome();
                        EmployerHome.name.setText(this.tusername.getText());
                    }
                }
                setVisible(false);
                
             
       }
            else if(e.getSource()==cancel){
                
                setDefaultCloseOperation(HIDE_ON_CLOSE);
            }
          
            setVisible(false);
      }

       
       
    
}
    
    

