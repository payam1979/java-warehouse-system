/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warehouse;
  import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Peyman
 */
public class testTable {
    


  public static void main(String[] args) {
     

    try 
  {
       String host = "jdbc:derby://localhost:1527/invoice";
            String uName = "payam";
            String uPass = "123456";
    
      Connection con = DriverManager.getConnection(host, uName, uPass);
    
      String query = "SELECT * FROM TABLETEST";
    
      Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
      ResultSet res = stm.executeQuery(query);
    
      String columns[] = { "ID", "Name", "Age" };
      res.last();
      int j = res.getRow();
      String data[][] = new String[j][3];
    System.out.println(j);
      int i = 1;
      res.first();
       String id0 = res.getString("ID");
        String nom0 = res.getString("name");
        String age0 = res.getString("age");
        data[0][0] = id0 ;
        data[0][1] = nom0;
        data[0][2] = age0;
      
      
      while (res.next()) {
         String id = res.getString("ID");
        String nom = res.getString("name");
        String age = res.getString("age");
        data[i][0] = id ;
        data[i][1] = nom;
        data[i][2] = age;
        i++;
      }
    
      DefaultTableModel model = new DefaultTableModel(data, columns);
      JTable table = new JTable(model);
      table.setShowGrid(true);
      table.setShowVerticalLines(true);
      JScrollPane pane = new JScrollPane(table);
      JFrame f = new JFrame("Populate JTable from Database");
      JPanel panel = new JPanel();
      panel.add(pane);
      f.add(panel);
      f.setSize(500, 600);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
    
    } catch(SQLException e) {
    }
  }
}  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

