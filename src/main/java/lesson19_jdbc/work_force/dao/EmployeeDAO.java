package lesson19_jdbc.work_force.dao;

import lesson19_jdbc.DBConnection;
import lesson19_jdbc.work_force.model.Employee;
import lesson19_jdbc.work_force.model.Job;

import java.sql.*;
import java.util.*;

public class EmployeeDAO {

    private static EmployeeDAO INSTANCE = null;

    private static final String SQL_FIND_ALL_EMPLOYEES_WITH_JOBS = "SELECT * FROM employees e JOIN emp_job ej ON e.id = ej.emp_id " +
            "JOIN jobs j ON j.id = ej.job_id";
    private static final String SQL_FIND_EMPLOYEE_BY_ID = "SELECT * FROM employees e JOIN emp_job ej ON e.id = ej.emp_id " +
            "JOIN jobs j ON j.id = ej.job_id WHERE e.id = ?";
    private static final String SQL_FIND_INCOME_OF_ALL_EMPLOYEES = "SELECT e.id,e.fullName, SUM(j.salary) AS sum_salary FROM employees e " +
            "JOIN emp_job ej ON e.id = ej.emp_id JOIN jobs j ON j.id = ej.job_id GROUP BY e.fullName ORDER BY e.id";
    private static final String SQL_FIND_EMPLOYEE_BY_NUMBER_OF_JOBS = "SELECT e.id,e.fullName, COUNT(j.name) AS count_jobs FROM employees e " +
            "JOIN emp_job ej ON e.id = ej.emp_id JOIN jobs j ON j.id = ej.job_id GROUP BY e.fullName ORDER BY e.id";
    private static final String SQL_FIND_EMPLOYEE_BY_SALARY = "SELECT e.id,e.fullName, SUM(j.salary) AS sum_salary FROM employees e " +
            "JOIN emp_job ej ON e.id = ej.emp_id JOIN jobs j ON j.id = ej.job_id  GROUP BY e.fullName ORDER BY e.id";

    public EmployeeDAO() {}

    public List<Employee> findAllEmployeesWithJobs() {
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_FIND_ALL_EMPLOYEES_WITH_JOBS)) {
            ResultSet resultSet = statement.executeQuery();
            Map<Integer, Employee> employeeMap = new HashMap<>();
            while (resultSet.next()) {
                int emp_id = resultSet.getInt("e.id");
                int job_id = resultSet.getInt("j.id");
                String job_name = resultSet.getString("j.name");
                int salary = resultSet.getInt("j.salary");
                Job job = new Job(job_id, job_name, salary);
                if (!employeeMap.containsKey(emp_id)) {
                    List<Job> jobs = new ArrayList<>(Collections.singleton(job));
                    String emp_name = resultSet.getString("e.fullName");
                    Employee employee = new Employee(emp_id, emp_name, jobs);
                    employeeMap.put(emp_id, employee);
                } else {
                    Employee employee = employeeMap.get(emp_id);
                    employee.getJobList().add(job);
                }
            }
            resultSet.close();
            return new ArrayList<>(employeeMap.values());

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Employee findEmployeeByID(int id) {
        Employee employee = null;
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_FIND_EMPLOYEE_BY_ID)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int emp_id = resultSet.getInt("e.id");
                String emp_name = resultSet.getString("e.fullName");
                int job_id = resultSet.getInt("j.id");
                String job_name = resultSet.getString("j.name");
                int salary = resultSet.getInt("j.salary");
                Job job = new Job(job_id, job_name, salary);
                List<Job> jobs = new ArrayList<>(Collections.singleton(job));
                employee = new Employee(emp_id, emp_name, jobs);
                while (resultSet.next()) {
                    int job__id = resultSet.getInt("j.id");
                    String job__name = resultSet.getString("j.name");
                    int salaryy = resultSet.getInt("j.salary");
                    Job jobb = new Job(job__id, job__name, salaryy);
                    employee.getJobList().add(jobb);
                }
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    public List<Job> findAllJobs(){
        List<Job> jobs = new ArrayList<>();
        try(Connection connection = DBConnection.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM jobs");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                jobs.add(new Job(resultSet.getInt("id"),resultSet.getString("name"),resultSet.getInt("salary")));
            }
            statement.close();
            return jobs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public String findTotalIncomeOfAllEmployees() {
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_FIND_INCOME_OF_ALL_EMPLOYEES)) {
            ResultSet resultSet = statement.executeQuery();
            StringBuilder builder = new StringBuilder("");
            while (resultSet.next()) {
                int emp_id = resultSet.getInt("e.id");
                String emp_name = resultSet.getString("e.fullName");
                int sum_salary = resultSet.getInt("sum_salary");
                builder.append(String.format("%d. %s: total income = %d\n", emp_id, emp_name, sum_salary));
            }
            resultSet.close();
            return builder.toString();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String findEmployeeBySalary(int salary) {
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_FIND_EMPLOYEE_BY_SALARY)) {
            ResultSet resultSet = statement.executeQuery();
            StringBuilder builder = new StringBuilder("");
            while (resultSet.next()) {
                int sum_salary = resultSet.getInt("sum_salary");
                if (sum_salary >= salary) {
                    int emp_id = resultSet.getInt("e.id");
                    String emp_name = resultSet.getString("e.fullName");
                    builder.append(String.format("%d. %s: total income = %d\n", emp_id, emp_name, sum_salary));
                }
            }
            resultSet.close();
            return builder.toString();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String findEmployeeByNumberOfJobs(int count) {
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_FIND_EMPLOYEE_BY_NUMBER_OF_JOBS)) {
            ResultSet resultSet = statement.executeQuery();
            StringBuilder builder = new StringBuilder("");
            while (resultSet.next()) {
                int count_jobs = resultSet.getInt("count_jobs");
                if (count_jobs >= count) {
                    int emp_id = resultSet.getInt("e.id");
                    String emp_name = resultSet.getString("e.fullName");
                    builder.append(String.format("%d. %s: number of jobs = %d\n", emp_id, emp_name, count_jobs));
                }
            }
            resultSet.close();
            return builder.toString();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Employee addEmployeeToDB(Employee employee) {
        Connection connection = null;
        try {
            connection = DBConnection.getConnection();
            connection.setAutoCommit(false);

            PreparedStatement statement1 = connection.prepareStatement("INSERT INTO employees (fullName) VALUES (?);", Statement.RETURN_GENERATED_KEYS);
            statement1.setString(1, employee.getFullName());
            statement1.executeUpdate();
            ResultSet generatedKeys1 = statement1.getGeneratedKeys();
            if (generatedKeys1.next()) {
                employee.setId(generatedKeys1.getInt(1));
            }
            statement1.close();

            for (Job job : employee.getJobList()) {
                if (!findAllJobs().contains(job)) {
                    PreparedStatement statement2 = connection.prepareStatement("INSERT INTO jobs (name,salary) VALUES (?,?);", Statement.RETURN_GENERATED_KEYS);
                    statement2.setString(1, job.getName());
                    statement2.setInt(2, job.getSalary());
                    statement2.executeUpdate();
                    ResultSet generatedKeys2 = statement2.getGeneratedKeys();
                    if (generatedKeys2.next()) {
                        job.setId(generatedKeys2.getInt(1));
                    }
                    statement2.close();
                }
            }

            for (Job job : employee.getJobList()) {
                PreparedStatement statement3 = connection.prepareStatement("INSERT INTO emp_job (emp_id,job_id) VALUES (?,?);");
                statement3.setInt(1, employee.getId());
                if (!findAllJobs().contains(job)) {
                    statement3.setInt(2, job.getId());
                } else {
                    for (Job j : findAllJobs()){
                        if (j.equals(job)){
                            statement3.setInt(2,j.getId());
                            job.setId(j.getId());
                        }
                    }
                }
                statement3.executeUpdate();
                statement3.close();
            }

            connection.commit();
        } catch (SQLException e) {
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return employee;
    }

    public static EmployeeDAO newInstance (){
        if (INSTANCE == null){
            synchronized (EmployeeDAO.class){
                if (INSTANCE == null){
                    INSTANCE = new EmployeeDAO();
                }
            }
        }
        return INSTANCE;
    }

}
