
package jobportal;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import static java.awt.Font.ITALIC;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

class retrieve{
     public static String uname;
     Jobseeker job1=new Jobseeker(); 
      FileReader  f;
      BufferedReader bf;
      public static  String[] str=new String[50];
     
   public static  ArrayList<Jobseeker> jss = new ArrayList<Jobseeker>();
    public static Jobseeker[] job=new Jobseeker[5];
    Jobseeker j=new Jobseeker(); 
    
     public void setuname(String str){
            uname=str;
           
        }
     public void setemp(){
        
        // System.out.println("In side");
         try{
              File in =new File(uname);
            //  System.out.println(uname);
         int size=(int)in.length();
         if(size!=0)
         {
             f=new FileReader(uname);
             bf=new BufferedReader(f);
            
             int i=0;
             while((str[i++]=bf.readLine())!=null)
             {
                 
             }
           
           
         }
        
            bf.close();
            f.close();
         
         }
         catch(Exception e){
            // System.out.println(e);
         }
     }
     
}

public class JobSelect extends JFrame implements ActionListener{
   
    
    JPanel p,p1,p2,p3,p4,p5,p6,p7;
    JButton b1,b2,b3,b4,b5;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
     Font f,f1;
    retrieve r=new retrieve();
   public static String s,str;
   
   public void fileWrite(String str){
     try{
          FileWriter fw=new FileWriter("Result",true);
          BufferedWriter bf=new BufferedWriter(fw);
          bf.write(str);
          bf.write("\r\n");
         
          bf.close();
          fw.close();
          
          
      }catch(IOException ex){
          
      }
}
   
    public JobSelect() {
       
         
       s="                       ";
       f = new Font("Arial",Font.PLAIN,15);
       f1 = new Font("Times New Roman",Font.BOLD,15);
       
       p=new JPanel(new GridLayout(8,1));
       
       p7=new JPanel();
       p1=new JPanel();
       p2=new JPanel();
       p3=new JPanel();
       p4=new JPanel();
       p5=new JPanel();
       p6=new JPanel();
       
       p.add(p6);
       
       l1=new JLabel(""); 
       l1.setFont(f);
       
       l2=new JLabel("NAME"+s+"QUALIFICATIOIN"); 
       l2.setFont(f1);
       l4=new JLabel("           ");
      
       
       p7.add(l2);
       p7.add(l4);
       p1.add(l1);
      
       
       b1=new JButton("Select");
       p1.add(b1);
       
       l3=new JLabel(""); 
       l3.setFont(f);
       
      
       
       p2.add(l3);
       
       
       b2=new JButton("Select");
       p2.add(b2);
       
       l5=new JLabel(""); 
       l5.setFont(f);
       
      
       
       p3.add(l5);
     
       
       b3=new JButton("Select");
       p3.add(b3);
       
       l7=new JLabel(""); 
       l7.setFont(f);
       
      
       
       p4.add(l7);
      
       
       b4=new JButton("Select");
       p4.add(b4);
       
       l9=new JLabel(""); 
       l9.setFont(f);
       
     
       
       p5.add(l9);
       
       
       b5=new JButton("Select");
       p5.add(b5);
       
       p.add(p7);
       p.add(p1);p.add(p2);p.add(p3);
       p.add(p4);
       p.add(p5);
   
       r.setemp();
      
       
      l1.setText(retrieve.str[0]);
      l3.setText(retrieve.str[1]);
      l5.setText(retrieve.str[2]);
      l7.setText(retrieve.str[3]);
      l9.setText(retrieve.str[4]);
 
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
       
       add(p);
       setVisible(true);
       setSize(500,400);
       setLocationRelativeTo(null);
       setTitle("Selection Portal");
       
       
    }

     
    public void actionPerformed(ActionEvent e) {
         Employer ep=new Employer(); 
         String s1 = null;
          String str=null;
         Iterator<Employer> itr=AddObject.al.iterator();
         while(itr.hasNext())
         {
             ep=itr.next();
             if(ep.getUserName().equals(retrieve.uname));
             {
                 s1=ep.getName();
                 
             }
         }
         
         
         
      if(e.getSource()==b1){
        JOptionPane.showMessageDialog(null, "You've selected candidate" );
        str=l1.getText()+JobSelect.s+JobSelect.s+s1;
        fileWrite(str);  
        l1.setText(null);
          
      }  
      if(e.getSource()==b2){
            JOptionPane.showMessageDialog(null, "You've selected candidate" );
            str=l3.getText()+JobSelect.s+JobSelect.s+s1;
          fileWrite(str); 
           l3.setText(null);
      }  
      if(e.getSource()==b3){
            JOptionPane.showMessageDialog(null, "You've selected candidate" );
          str=l5.getText()+JobSelect.s+JobSelect.s+s1;
          fileWrite(str); 
           l5.setText(null);
      }  
      if(e.getSource()==b4){
            JOptionPane.showMessageDialog(null, "You've selected candidate" );
          str=l7.getText()+JobSelect.s+JobSelect.s+s1;
          fileWrite(str); 
           l7.setText(null);
      }  
      if(e.getSource()==b5){
            JOptionPane.showMessageDialog(null, "You've selected candidate" );
          str=l9.getText()+JobSelect.s+JobSelect.s+s1;
          fileWrite(str); 
           l9.setText(null);
      }
      
     try{
             // System.out.println(store.uname);
               FileWriter f1=new  FileWriter(retrieve.uname);
               BufferedWriter bf=new BufferedWriter(f1);
               if(l1.getText()!=null){
               bf.write(l1.getText());
               bf.write("\r\n");
               //System.out.println(str);
               }
               if(l3.getText()!=null){
               bf.write(l3.getText());
               bf.write("\r\n");
               //System.out.println(str);
               }
               if(l5.getText()!=null){
               bf.write(l5.getText());
               bf.write("\r\n");
               //System.out.println(str);
               }
               if(l7.getText()!=null){
               bf.write(l7.getText());
               bf.write("\r\n");
               //System.out.println(str);
               }
               if(l9.getText()!=null){
               bf.write(l9.getText());
               bf.write("\r\n");
               //System.out.println(str);
               }
               bf.close();
               f1.close();
               
              
           }catch(Exception exp){
               exp.printStackTrace();
               
           } 
      
     
    }
    
}