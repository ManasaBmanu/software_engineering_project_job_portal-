
package jobportal;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class JobseekerLogin extends JFrame {
    JPanel p,p1,p2,p3,p4;
    JButton b1,b2;
    JLabel l1,l2;
    JTextField t;
    JPasswordField pwd;
    Font f;

  

    public JobseekerLogin(){
       setVisible(true);
       setSize(400,300);
       setLocationRelativeTo(null);
       setTitle("Login Portal");
      
       f = new Font("Arial",Font.BOLD,15);
       
       
       p=new JPanel(new GridLayout(7,1));
       
       p1=new JPanel();
       p2=new JPanel();
       p3=new JPanel();
       p4=new JPanel();
       
       p.add(p4);
       
       l1=new JLabel("Username :"); 
       l1.setFont(f);
       p1.add(l1);
       
       t=new JTextField(15);
       p1.add(t);
       
       l2=new JLabel("Password :"); 
       l2.setFont(f);
       p2.add(l2);
       
       pwd=new JPasswordField(15);
       p2.add(pwd);
        
       p.add(p1);
       p.add(p2);
       
       b1=new JButton("Login");
       p3.add(b1);
       
       b2=new JButton("Cancel");
       p3.add(b2);
       
      
       
      event e=new event();
       b1.addActionListener(e);    
       event1 e1=new event1();
       b2.addActionListener(e1);
       p.add(p3);
       
        add(p);
         setVisible(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
       // System.out.println("logged in user+++"+t.getText());
    }
    
    
    
    public class event implements ActionListener{
        boolean flag;
        public void actionPerformed(ActionEvent e){
            AddObject a=new AddObject();
            char[] passwd=pwd.getPassword();
            // System.out.println("logged in user+++"+t.getText());
            flag=a.checkJobSeekerUser(t.getText(),passwd);
            if(flag)
            {
            
            JobSeekerHomePage h=new JobSeekerHomePage();
            JobSeekerHomePage.name.setText(t.getText());
           
            }
            
           store s=new store();
           s.setuname(t.getText());
      }
       
        }
    
     public class event1 implements ActionListener{
            public void actionPerformed(ActionEvent e1)
            {
             setVisible(false);
              
            }
    }
    
   
  
}
