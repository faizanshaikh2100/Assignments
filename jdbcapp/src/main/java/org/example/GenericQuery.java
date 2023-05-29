package org.example;


import java.sql.*;

public class GenericQuery {
    static final String DB_URL = "jdbc:mysql://localhost/";
    static final String USER = "root";
    static final String PASS = "yedtutti";

    public static void main(String[] args) {
        Connection conn;
        Statement stmt;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            // Execute create database query
            System.out.println("Creating database");
            stmt = conn.createStatement();
            String sql = "CREATE DATABASE test_db1";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully");


            sql = "USE test_db1";
            stmt.executeUpdate(sql);
            System.out.println("Using database test_db");

            System.out.println("Creating tabl");
            sql = "CREATE TABLE users (id INT, name VARCHAR(50), age INT, PRIMARY KEY (id))";
            stmt.executeUpdate(sql);
            System.out.println("Table created successfully");

            System.out.println("Dropping table");
            sql = "DROP TABLE users";
            stmt.executeUpdate(sql);
            System.out.println("Table dropped successfully!");

            // Execute drop database query
            System.out.println("Dropping database...");
            sql = "DROP DATABASE test_db1";
            stmt.executeUpdate(sql);
            System.out.println("Database dropped successfully!");

            stmt.close();
            conn.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}