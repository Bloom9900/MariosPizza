/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MariosPizza.DataMapper;


import MariosPizza.Util.DBConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import MariosPizza.Model.Pizza;

/**
 *
 * @author angry
 */
public class PizzaMapper {
    public static ArrayList<Pizza> pizzaList() throws ClassNotFoundException, SQLException {
        ArrayList<Pizza> returnList = new ArrayList<>();
        
     /*   `movie_id` int(11) NOT NULL AUTO_INCREMENT,
   `Pizza_name` varchar(100) NOT NULL,
   `director` varchar(50) NOT NULL,
   `year` year(4) NOT NULL,
   `genre_id` int(11) NOT NULL,*/
        // TODO: hent fra databasen
        Connection myConnector = null;
        Statement statement = null;
        ResultSet resultSet = null;

        myConnector = DBConnector.getConnector();
        String query = "SELECT * FROM pizzamenu";
        statement = myConnector.createStatement();
        resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            String pizza_name = resultSet.getString("Pizza_name");
            int pizza_nr = resultSet.getInt("pizza_nr");
            int pris = resultSet.getInt("pris");
            String topping1 = resultSet.getString("Topping1");
            String topping2 = resultSet.getString("Topping2");
            String topping3 = resultSet.getString("Topping3");
            String topping4 = resultSet.getString("Topping4");
            String topping5 = resultSet.getString("Topping5");
            String topping6 = resultSet.getString("Topping6");
            String topping7 = resultSet.getString("Topping7");
           // String topping1 = resultSet.getString("Topping1");
           // int movie_id = resultSet.getInt("movie_id");
            Pizza tmpPizza = new Pizza(pizza_name,pris,pizza_nr,topping1,topping2,topping3,topping4,topping5,topping6,topping7);
            returnList.add(tmpPizza);
        }

        //lukker efter mig
        resultSet.close();
        statement.close();
        myConnector.close();

        return returnList;
    
}
}
