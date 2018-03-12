/*
 * To change this license header, choose License Headers in Project Properties..
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package jobportal;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import static java.util.Collections.list;
import javax.swing.*;
/**
 *
 * @author Manasa
 */
    
   class store{
       public static String uname;
       String str,s;
       
       public void setuname(String str){
           
            uname=str;
            //System.out.println("uname: "+str);
           
        }
       public void getuobj(String file)
       {
           Jobseeker js=new Jobseeker();
           Jobseeker js1=new Jobseeker();
           s="                          ";
           Iterator<Jobseeker> itr=AddObject.alj.iterator();
           while(itr.hasNext())
           {
               js=itr.next();
               if(js.getUserName().equals(uname))
               {
                   js1=js;
               }
           }
           try{
               FileWriter f=new  FileWriter(file,true);
               BufferedWriter bf=new BufferedWriter(f);
               str=s+js1.getName()+s+s+js1.getQual();
               bf.write(str);
               bf.write("\r\n");
               //System.out.println(str);
              bf.close();
              f.close();
               
              
           }catch(Exception e){
               
           } 
       }
       
    }
    
public class SearchJob extends JFrame implements ActionListener{
    JPanel headpanel,p,p1,p2,p3,p4,p5,p6;
    JButton b1,b2,b3,b4,b5;
    JLabel head,l1,l2,l3,l4,l5;
    String strj[];
    
  AddObject ao=new AddObject();
    
    public SearchJob(){
        
        
        p=new JPanel(new GridLayout(8,1));
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p4=new JPanel();
        p5=new JPanel();
        p6=new JPanel();
        headpanel=new JPanel();
        
        head=new JLabel("SEARCH FOR A JOB");
        headpanel.add(head);
        p.add(headpanel);
        
        l1=new JLabel("");
        p1.add(l1);
        b1=new JButton("Apply here");
        p1.add(b1);
        p.add(p1);
        
        l2=new JLabel("");
        p2.add(l2);
        b2=new JButton("Apply here");
        p2.add(b2);
        p.add(p2);
        
        l3=new JLabel("");
        p3.add(l3);
        b3=new JButton("Apply here");
        p3.add(b3);
        p.add(p3);
        
        l4=new JLabel("");
        p4.add(l4);
        b4=new JButton("Apply here");
        p4.add(b4);
        p.add(p4);
        
        l5=new JLabel("");
        p5.add(l5);
        b5=new JButton("Apply here");
        p5.add(b5);
        p.add(p5);
        
//        cancel=new JButton("Close");
//        p6.add(cancel);
        p.add(p6);
      
        add(p);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        //cancel.addActionListener(this);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
  
        strj=ao.getList();
        //for(int i=0;i<strj.length;i++)
            //System.out.println(strj[i]);
        
        
        
        l1.setText(strj[0]);
        l2.setText(strj[1]);
        l3.setText(strj[2]);
        l4.setText(strj[3]);
        l5.setText(strj[4]);
        
        setSize(600,600);
        setLocationRelativeTo(null);
         setVisible(true);
       
    }
    
  
    public void actionPerformed(ActionEvent ae) {
        store st=new store();
     
      if(ae.getSource()==b1){
         st.getuobj(strj[0]);
         b1.setBackground(new Color(186,85,211));
         b1.setEnabled(false);
         JOptionPane.showMessageDialog(null, "You've successfully applied for " + strj[0] + " job");
      }
      if(ae.getSource()==b2){
        st.getuobj(strj[1]);
         b2.setBackground(new Color(186,85,211));
         b1.setEnabled(false);
        JOptionPane.showMessageDialog(null, "You've successfully applied for " + strj[1] + " job");
      }
      if(ae.getSource()==b3){
          st.getuobj(strj[2]);
         b3.setBackground(new Color(186,85,211));
         b1.setEnabled(false);
          JOptionPane.showMessageDialog(null, "You've successfully applied for " + strj[2] + " job");
      }
      if(ae.getSource()==b4){
          st.getuobj(strj[3]);
         b4.setBackground(new Color(186,85,211));
         b1.setEnabled(false);
          JOptionPane.showMessageDialog(null, "You've successfully applied for " + strj[3] + " job");
      }
      if(ae.getSource()==b5){
          st.getuobj(strj[4]);
         b5.setBackground(new Color(186,85,211));
         b1.setEnabled(false);
          JOptionPane.showMessageDialog(null, "You've successfully applied for " + strj[4] + " job");
      }
    }
}


