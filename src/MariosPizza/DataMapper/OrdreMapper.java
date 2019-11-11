package MariosPizza.DataMapper;

import MariosPizza.Model.Order;
import MariosPizza.Util.DBConnector;
import java.util.ArrayList;
import java.sql.*;

public class OrdreMapper {

    public static ArrayList<Order> orderList() throws ClassNotFoundException, SQLException {
        ArrayList<Order> returnList = new ArrayList<>();

        /*
        
         */
        //TODO: Hent fra DB
        Connection myConnector = null;
        Statement statement = null;
        ResultSet resultSet = null;

        myConnector = DBConnector.getConnector();
        String query = "SELECT * FROM ordre";
        statement = myConnector.createStatement();
        resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int ordre_nummer = resultSet.getInt("ordre_nummer");
            String kundenavn = resultSet.getString("kundenavn");
            int antal = resultSet.getInt("antal");
            Order tmpOrder = new Order(ordre_nummer, kundenavn, antal);
            returnList.add(tmpOrder);
        }

        //lukker efter mig
        resultSet.close();
        statement.close();
        myConnector.close();

        return returnList;
    }

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
    }
    
}
