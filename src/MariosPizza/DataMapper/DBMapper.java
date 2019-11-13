/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MariosPizza.DataMapper;

import MariosPizza.Model.Order;
import MariosPizza.Util.DBConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import MariosPizza.Model.Pizza;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import MariosPizza.Model.Order;
import java.util.Scanner;

/**
 *
 * @author angry
 */
//Henter menuen fra databasen.
public class DBMapper {

    public ArrayList<Pizza> pizzaList() throws ClassNotFoundException, SQLException {
        ArrayList<Pizza> returnList = new ArrayList<>();

        Connection myConnector = null;
        Statement statement = null;
        ResultSet resultSet = null;

        myConnector = DBConnector.getConnector();
        String query = "SELECT * FROM pizzamenu";
        statement = myConnector.createStatement();
        resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            String pizza_name = resultSet.getString("Pizza_name");
            int pizza_nr = resultSet.getInt("pizza_nr");
            int pris = resultSet.getInt("pris");
            String topping = resultSet.getString("Topping");

            Pizza tmpPizza = new Pizza(pizza_name, pris, pizza_nr, topping);
            returnList.add(tmpPizza);
        }

        //lukker efter mig
        resultSet.close();
        statement.close();
        myConnector.close();

        return returnList;
        

    }
    
    
    
    // Sætter order ind i databassen
     public  void DBAddPizza(Order pizzas){
        try{
            String Customer_name = pizzas.getKundeNavn();
            int Order_ID = pizzas.getOrderID();
            int Pizza = pizzas.getPizzaNr();
            int Pris = pizzas.getPris();
            
            Class.forName("com.mysql.cj.jdbc.Driver");
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marriospizza?", "root", "klon3903202");
   PreparedStatement pst = con.prepareStatement("insert into ordre(Order_ID,Customer_name,Pizza,Pris) values(?,?,?,?)");
 
     pst.setInt(1,Order_ID);
     pst.setString(2, Customer_name);
     pst.setInt(3, Pizza);
     pst.setInt(4, Pris);
        
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
    
    
    
    
    ArrayList pizzaInf;

    public ArrayList getPizzaInf() {
        return pizzaInf;
    }
    //henter pizzaer fra dabassen
     public ArrayList DBGetPizza() throws SQLException{
           ArrayList pizzaInf = new ArrayList<>();
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marriospizza?", "root", "klon3903202");
      Order odr = new Order();
 
   try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Vælg pizza:");
            int str = sc.nextInt();

            Statement stmt2 = null;
            String query2 = "SELECT * FROM pizzamenu  WHERE Pizza_nr =" + str + "";
            stmt2 = con.createStatement();
            ResultSet result = stmt2.executeQuery(query2);
            while (result.next()) {
                int pizza_nr = (int) result.getInt("Pizza_nr");
                String pizza_name = (String) result.getString("Pizza_name");
                String topping = (String) result.getString("Topping");
                int pris = (int) result.getInt("Pris");
                System.out.println(pizza_nr + pizza_name + topping + pris);
                
                 Pizza tmpPizza = new Pizza(pizza_name, pris, pizza_nr, topping);
                 pizzaInf.add(tmpPizza);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return pizzaInf;
    }
}
   
      
    
     

   
    
    
    
    
    /*
    //trækker ordren ud af databassen ind i programmet
     public static Order getOrderFromDBByID(int id) throws ClassNotFoundException, SQLException {
        Order retValOrder = null;
        //TODO: Get order from DB
        String query = "SELECT * FROM order WHERE ordre_nummer = ?";

        Connection myConnector = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        myConnector = DBConnector.getConnector();

        pstmt = myConnector.prepareStatement(query);
        pstmt.setInt(1, id);
        resultSet = pstmt.executeQuery();
        while (resultSet.next()) {
            int ordre_nummer = resultSet.getInt("ordre_nummer");
            String kundenavn = resultSet.getString("kundenavn");
            int antal = resultSet.getInt("antal");
            retValOrder = new Order(ordre_nummer, kundenavn, antal);
        }

        //lukker efter mig
        resultSet.close();
        pstmt.close();
        myConnector.close();
        
        return retValOrder;
    }*/
    
    
    

