package MariosPizza.Util;

import java.sql.*;

public class DBConnector {
    public static Connection getConnector() throws ClassNotFoundException, SQLException {
        Connection connector = null;
        String url = "jdbc:mysql://localhost:3306/movies?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";
        String user = "root";
        String password = "King85410";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connector = DriverManager.getConnection(url, user, password);

        return connector;
    }
}