package lesson19_jdbc.work_force;

import lesson19_jdbc.work_force.dao.EmployeeDAO;
import lesson19_jdbc.work_force.model.Employee;

import java.util.List;

public class WorkForceApp {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        List<Employee> employeeList = employeeDAO.findAllEmployeesWithJobs();
        employeeList.forEach(System.out::println);
        System.out.println();

        String totalIncomeOfAllEmployees = employeeDAO.findTotalIncomeOfAllEmployees();
        System.out.println(totalIncomeOfAllEmployees);

        String employeeByNumberOfJobs = employeeDAO.findEmployeeByNumberOfJobs(3);
        System.out.println(employeeByNumberOfJobs);

        String employeeBySalary = employeeDAO.findEmployeeBySalary(3500);
        System.out.println(employeeBySalary);

        Employee employeeByID = employeeDAO.findEmployeeByID(3);
        System.out.println(employeeByID);

    }
}
