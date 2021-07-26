package lesson19_jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBconnection {

    public static Connection getConnection() throws SQLException {
        Properties properties = new Properties();
        try(InputStream inputStream = DBconnection.class.getClassLoader()
                .getResourceAsStream("db.properties")){
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String url = properties.getProperty("db.url");
        String userName = properties.getProperty("db.username");
        String password = properties.getProperty("db.password");
        String driver = properties.getProperty("db.driver");
//        Если ругается на драйвер нужно написать:
//        Class.forName(driver);

        return DriverManager.getConnection(url,userName,password);
    }
}
