package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection createDBConnection() throws SQLException, ClassNotFoundException {
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        String url = "jdbc:mysql://localhost:3306/wileyjdbc";
        String name = "root";
        String password = "yedtutti";

        Connection conn = DriverManager.getConnection(url,name,password);
        System.out.println("Connection success");
        return conn;
    }
}