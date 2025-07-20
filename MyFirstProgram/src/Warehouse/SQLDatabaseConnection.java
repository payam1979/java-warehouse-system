/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warehouse;

/**
 *
 * @author Peyman
 */

	
import java.sql.*;
 
public class SQLDatabaseConnection {
    // Connect to your database.  // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args) {
         
        try {
            String host = "jdbc:derby://localhost:1527/invoice";
            String uName = "payam";
            String uPass = "123456";
            
            Connection con = DriverManager.getConnection(host,uName,uPass);
      
     
    System.out.println("Connected to Sql Server ! ");
 Statement stmt = con.createStatement();
 String SQL = "select*from invoicedb ";
 ResultSet rs = stmt.executeQuery(SQL);
 
 while(rs.next()){
 int invoicenumber_col = rs.getInt("invoicenumber");
  String date = rs.getString("date");
 String name = rs.getString("name");
  int quantity = rs.getInt("quantity");
 String recivedate = rs.getString("recivedate");
 String expiredate = rs.getString("expiredate");
 String accconfirmdate = rs.getString("accconfirmdate");
 String managerconfirmdate = rs.getString("managerconfirmdate");
 
 System.out.println(invoicenumber_col+" " + date +" " + name + " " + quantity + " " + recivedate + " " + expiredate + " " + accconfirmdate + " " + managerconfirmdate  );
 }
}
// Handle any errors that may have occurred.
catch (SQLException err) {
    System.out.println("not Connected to Sql Server ! ");
}


 
        }
    }

    


