/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MariosPizza.Main;

import java.util.Scanner;
import java.sql.*;

/**
 *
 * @author angry
 */
public class mainTEST {
 public static void main(String[] args){
        Scanner s=new Scanner(System.in);
         try {
             System.out.println("Order_ID:");
             int Order_ID = 2; 
             System.out.println("Customer_name:");
      String Customer_name =s.next();
      System.out.println("Pizza:");
      String Pizza =s.next();
      System.out.println("Pris:");
      String Pris = s.next();
      
             Class.forName("com.mysql.jdbc.Driver");
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marriospizza?", "root", "klon3903202");
   PreparedStatement pst = con.prepareStatement("insert into ordre(Order_ID,Customer_name,Pizza,Pris) values(?,?,?,?)");
 
  pst.setInt(1,Order_ID);
      pst.setString(2, Customer_name);
       pst.setString(3, Pizza);
        pst.setString(4, Pris);
        
      int i = pst.executeUpdate();
      if(i!=0){
        System.out.println("added");
      }
      else{
        System.out.println("failed to add");
      }
    }
    catch (Exception e){
     System.out.println(e);
    }
  }
   
}
