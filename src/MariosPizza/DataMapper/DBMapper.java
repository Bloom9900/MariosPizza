package MariosPizza.DataMapper;

import MariosPizza.Model.MainPizzaList;
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

public class DBMapper {

    ArrayList pizzaInf;

    public ArrayList getPizzaInf() {
        return pizzaInf;
    }

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
    public void DBAddPizza(Order pizzas) {
        try {
            String Customer_name = pizzas.getKundeNavn();
            int Order_ID = pizzas.getOrderID();
            int Pizza = pizzas.getPizzaNr();
            int Pris = pizzas.getPris();

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mariospizza?", "root", "password");
            PreparedStatement pst = con.prepareStatement("insert into ordre(Order_ID,Customer_name,Pizza,Pris) values(?,?,?,?)");

            pst.setInt(1, Order_ID);
            pst.setString(2, Customer_name);
            pst.setInt(3, Pizza);
            pst.setInt(4, Pris);

            int i = pst.executeUpdate();
            if (i != 0) {
                System.out.println("added");
            } else {
                System.out.println("failed to add");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Sætter order ind i databassen
    public int DBAddStat() {

        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mariospizza?", "root", "password");
            PreparedStatement pst = con.prepareStatement("UPDATE statistik SET antal = antal + 1 WHERE Pizza_nr =" + str + "");
            int i = pst.executeUpdate();
            if (i != 0) {
            } else {
                System.out.println("failed to add");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return str;
    }

    public void DBAddOmst() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mariospizza?", "root", "password");
            String query = "SELECT p.Pizza_Nr, p.Pizza_name, p.Topping, s.Antal, p.Pris, (p.pris*s.antal) Omsætning FROM pizzamenu p, statistik s WHERE p.Pizza_nr = s.Pizza_nr ORDER BY Omsætning DESC;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int pizzaNr = rs.getInt("Pizza_Nr");
                String Pizza_name = rs.getString("Pizza_name");
                String Topping = rs.getString("Topping");
                int Pris = rs.getInt("Pris");
                int Antal = rs.getInt("Antal");
                int Omsætning = rs.getInt("Omsætning");
                System.out.println(pizzaNr + " " + Pizza_name + " " + Topping + ":    Antal Solgt: " + Antal + " Pris:" + Pris + " Omsætning: " + Omsætning);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
