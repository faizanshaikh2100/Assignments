package org.example;
import java.sql.*;

public class App
{
    public static void main( String[] args )throws Exception
    {
        Connection connection = null;

//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/wileyclassic",
//                    "root", "yedtutti");
//            System.out.println("Connection Successful");
//
//        }
//        catch(Exception e) {
//            e.printStackTrace();
//	}
        try(Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyclassic?user=root&password=yedtutti")){
            PreparedStatement statement = con.prepareStatement("select * from customers");
            ResultSet rs =statement.executeQuery();
            while ((rs.next())){
                System.out.println(rs.getString(1)+" "+rs.getString(2));
            }
        } catch (SQLException e) {

        }
    }
}
