package lesson19_jdbc.connectionDemo;

import lesson19_jdbc.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionDemo5 {
    private static final String SQL_PRODUCTS = "SELECT * FROM Products";

    public static void main(String[] args) {
        //https://metanit.com/java/database/2.5.php
        try (Connection conn = DBConnection.getConnection();
             Statement statement = conn.createStatement()){
            System.out.println("Connection to Store DB successful!");
            ResultSet resultSet = statement.executeQuery(SQL_PRODUCTS);
            while(resultSet.next()){

                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int price = resultSet.getInt(3);
                System.out.printf("%d. %s - %d \n", id, name, price);
            }

        } catch (Exception throwables) {
            System.out.println("Connection failed...");
            System.out.println(throwables);
        }

    }
}
