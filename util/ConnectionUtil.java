package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    static {
        try{
            Class.forName("java.sql.Driver");
            String url = "jdbc:mysql://localhost:3306/product_manager_app";
            String username = "admin123";
            String password = "root";
            Connection connection = DriverManager.getConnection(url, username, password);
        }catch(ClassNotFoundException | SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        return null;
    }
}
