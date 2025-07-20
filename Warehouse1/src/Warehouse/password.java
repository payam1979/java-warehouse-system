/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warehouse;

import javax.swing.*;  
import java.awt.event.*;


 //@author Peyman

public class password {
    
     public static void main(String[] args) 
  {  
    JFrame frame = new JFrame();  
    
    final JPasswordField password = new JPasswordField(); 
    password.setBounds(120, 70, 150, 30); 
    
    JLabel label1 = new JLabel("Username:");  
    label1.setBounds(15, 20, 100, 30);  
    
    JLabel label2 = new JLabel("Password:");  
    label2.setBounds(15, 70, 100, 30);  
    
    JButton btn = new JButton("Login");
    btn.setBounds(100, 130, 110, 30);  
    
    final JTextField tf = new JTextField();
    tf.setBounds(120, 20, 150, 30); 
    
    frame.add(password); 
    frame.add(label1); 
    frame.add(label2); 
    frame.add(btn); 
    frame.add(tf);
        
    frame.setSize(300,230);  
    frame.setLayout(null);  
    frame.setVisible(true);   
    
    btn.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e) 
      {
        System.out.println("Username : "+ tf.getText());
        System.out.println("Password: "+ new String(password.getPassword()));    
      }
    });
  } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
