package lesson19_jdbc.connectionDemo;

import lesson19_jdbc.DBConnection;

import java.sql.Connection;
import java.sql.Statement;

public class ConnectionDemo1 {
    private static  final String SQL_CREATE_TABLE = "CREATE TABLE products (Id INT PRIMARY KEY AUTO_INCREMENT, ProductName VARCHAR(20), Price INT)";

    public static void main(String[] args) {
        try (Connection connection = DBConnection.getConnection();
             Statement statement = connection.createStatement()){
            System.out.println("Connection to Store DB successful!");
            statement.executeUpdate(SQL_CREATE_TABLE);
            System.out.println("Database has been created!");

        } catch (Exception throwables) {
            System.out.println("Connection failed...");
            System.out.println(throwables);
        }
    }
}
