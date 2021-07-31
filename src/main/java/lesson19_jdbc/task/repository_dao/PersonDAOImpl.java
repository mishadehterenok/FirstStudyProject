package lesson19_jdbc.task.repository_dao;

import lesson19_jdbc.DBConnection;
import lesson19_jdbc.task.model.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PersonDAOImpl implements BaseDAO<Person> {
    final static String INSERT_PEOPLE = "INSERT Persons(FirstName, LastName, Age) VALUES (?, ?, ?)";
    final static String DELETE_PEOPLE = "DELETE FROM persons WHERE ID = ?";
    final static String FIND_PEOPLE = "SELECT * FROM persons WHERE ID = ?";

    @Override
    public boolean add(Person person) {
        int rows = 0;
        try (Connection connection = DBConnection.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PEOPLE);
            preparedStatement.setString(1, person.getFirstName());
            preparedStatement.setString(2, person.getLastName());
            preparedStatement.setInt(3, person.getAge());

            rows = preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rows != 0;
    }

    @Override
    public boolean delete(Person obj) {
        return false;
    }

    @Override
    public Person findByID(int id) {
        return null;
    }

    @Override
    public List<Person> findAll() {
        return null;
    }
}
