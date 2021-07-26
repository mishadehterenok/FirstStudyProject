package lesson19_jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class AppJDBC {
    public static void main(String[] args) {

        try (Connection connection = DBconnection.getConnection()) {
            System.out.println("Connection successful");

        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }
}
