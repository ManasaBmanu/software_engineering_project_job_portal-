/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobportal;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Manasa
 */
public class Result extends JFrame{
  String[] i=new String[50];
   int a=0;
    public Result(){
      
       try{
          FileReader fw=new FileReader("Result");
          BufferedReader bf=new BufferedReader(fw);
        
          while((i[a++]=bf.readLine())!=null)
          {
              
          }
         
          bf.close();
          fw.close();
          
          
      }catch(IOException ex){
          
      }
      
        JTable table;
        setLayout(new FlowLayout());
        String[] menu={"CANDIDATE NAME           QUALIFICATION            COMPANY NAME"};
        String[][] object={
           
            {i[0]},
            {i[1]},
            {i[2]},
            {i[3]},
            {i[4]},
            {i[5]},
            {i[6]},
            {i[7]},
            {i[8]},
            {i[9]},
        };
        table=new JTable(object,menu);
         
        table.setPreferredScrollableViewportSize(new Dimension(500,70));
        table.setFillsViewportHeight(true);
        table.setDragEnabled(false);
        table.setEnabled(false);
        
        
        JScrollPane scroll=new JScrollPane(table);
        add(scroll); 
        
        
        setSize(600,600);
        setLocationRelativeTo(null);
        setTitle("Result Table");
        setVisible(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        
        
    }
    
               }
  
    

