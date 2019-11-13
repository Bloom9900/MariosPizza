
import MariosPizza.Model.Order;
import MariosPizza.Model.Pizza;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OrderTest {
// henter pizza fra MenuDB

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marriospizza?", "root", "klon3903202");
        PreparedStatement pst = con.prepareStatement("insert into ordre(Order_ID,Customer_name,Pizza,Pris) values(?,?,?,?)");

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Vælg pizza:");
            int str = sc.nextInt();

            Statement stmt2 = null;
            String query2 = "SELECT * FROM pizzamenu  WHERE Pizza_nr =" + str + "";
            stmt2 = con.createStatement();
            ResultSet result = stmt2.executeQuery(query2);
            while (result.next()) {
                int Pizza_nr = (int) result.getInt("Pizza_nr");
                String Pizza_name = (String) result.getString("Pizza_name");
                String Topping = (String) result.getString("Topping");
                int Pris = (int) result.getInt("Pris");
                System.out.println(Pizza_nr + Pizza_name + Topping + Pris);
            }
        } catch (SQLException e) {
        }

    }
}
