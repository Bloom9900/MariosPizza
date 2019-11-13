
import MariosPizza.Model.Order;
import MariosPizza.Util.DBConnector;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author angry
 */
public class getFromDB {

    public static void main(String[] args)
  {
    try
    {
      // create our mysql database connection
       Class.forName("com.mysql.cj.jdbc.Driver");
      String url = "jdbc:mysql://localhost:3306/marriospizza?";
         url += "serverTimezone=UTC&allowPublicKeyRetrieval=true&";
        url += "useSSl=false";
      
      Connection conn = DriverManager.getConnection(url, "root", "klon3903202");
      
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      String query = "SELECT * FROM pizzamenu";

      // create the java statement
      Statement st = conn.createStatement();
      
      // execute the query, and get a java resultset
      ResultSet rs = st.executeQuery(query);
      
      // iterate through the java resultset
      while (rs.next())
      {
       
        int firstName = rs.getInt("Pizza_nr");
        String lastName = rs.getString("Pizza_name");
        String dateCreated = rs.getString("Topping");
        int isAdmin = rs.getInt("Pris");
       
        
        // print the results
        System.out.format("%s, %s, %s, %s, %s\n", firstName, lastName, dateCreated, isAdmin);
      }
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
  }
}
        
    

  /*  public static void getPizzaNr() {
        int Pizza_nr;
        Scanner myScan = new Scanner(System.in);
        Pizza_nr = myScan.nextInt();

       
    }

    public static ArrayList<Order> orderList(int Pizza_nr) throws ClassNotFoundException, SQLException {
        ArrayList<Order> returnList = new ArrayList<>();

        Connection myConnector = null;
        Statement statement = null;
        ResultSet resultSet = null;

        myConnector = DBConnector.getConnector();
        String query = "SELECT * FROM pizzamenu WHERE =?";
        statement = myConnector.createStatement();
        resultSet = statement.executeQuery(query);

        Pizza_nr = resultSet.getInt("Pizza_nr");
        String pizzaName = resultSet.getString("Pizza_name");
        String topping = resultSet.getString("Topping");
        int pris = resultSet.getInt("Pris");
        Order tmpOrder = new Order(Pizza_nr, pizzaName, topping, pris);
        returnList.add(tmpOrder);
        System.out.println(returnList);
        //lukker efter mig
        resultSet.close();
        statement.close();
        myConnector.close();

        return returnList;
        
    }

}*/
