package lesson19_jdbc.connectionDemo;

import lesson19_jdbc.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionDemo {
    public static void main(String[] args) {

        try (Connection connection = DBConnection.getConnection()) {
            System.out.println("Connection successful");

        } catch (SQLException e) {
            System.out.println("Connection failed");
        }
    }
}
