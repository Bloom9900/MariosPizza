package MariosPizza.Util;

import java.sql.*;

public class DBConnector {

    public static Connection getConnector() throws ClassNotFoundException, SQLException {
        Connection connector = null;
        String url = "jdbc:mysql://localhost:3306/MariosPizza?";
        url += "serverTimezone=UTC&allowPublicKeyRetrieval=true&";
        url += "useSSL=false";
        String user = "root";
        String password = "password";
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Connecting to Database...");
        connector = DriverManager.getConnection(url, user, password);

        return connector;
    }
}
