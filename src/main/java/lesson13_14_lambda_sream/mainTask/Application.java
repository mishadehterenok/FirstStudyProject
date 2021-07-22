package lesson13_14_lambda_sream.mainTask;

import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Job developer = new Job("Developer", 1500);
        Job teacher = new Job("Teacher", 800);
        Job driver = new Job("Driver", 700);
        Job engineer = new Job("Engineer", 1000);
        final Set<Job> jobs = Set.of(developer, driver, teacher, engineer);

        Employee emp1 = new Employee("Ivan", 22, Set.of(developer, driver, teacher));
        Employee emp2 = new Employee("Vasia", 15, Set.of(teacher, driver, engineer));
        Employee emp3 = new Employee("Max", 35, Set.of(teacher, driver));
        Employee emp4 = new Employee("Kostia", 37, Set.of(developer, engineer));
        Employee emp5 = new Employee("Mick", 26, Set.of(teacher, engineer));
        Employee emp6 = new Employee("John", 48, Set.of(teacher, developer));
        Employee emp7 = new Employee("Dima", 18, Set.of(driver, developer));
        Employee emp8 = new Employee("Egor", 28, Set.of(engineer));
        Employee emp9 = new Employee("Stas", 31, Set.of(teacher));
        Employee emp10 = new Employee("Alex", 55, Set.of(developer));

        List<Employee> empList = List.of(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10);
        long ageOver30 = empList.stream()
                .filter(emp -> emp.getAge() > 30)
                .count();
        System.out.println("Работники старше 30: " + ageOver30 + "\n");

        System.out.println("Работники с буквами М и V в именах: ");
        empList.stream()
                .filter(emp -> emp.getName().toLowerCase().contains("m") || emp.getName().toLowerCase().contains("v"))
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Сортировка по имени:");
        empList.stream()
                .map(Employee::getName)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Работники у которых больше двух работ:");
        List<Employee> listOver2Jobs = empList.stream()
                .filter(emp -> emp.getJobSet().size() > 2)
                .collect(Collectors.toList());
        listOver2Jobs.forEach(System.out::println);
        System.out.println();

        System.out.println("Сортировка по имени:");
        empList.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Сортировка по количеству работ:");
        empList.stream()
                .sorted(Comparator.comparing(emp -> emp.getJobSet().size()))
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Статистика по ЗП:");
        IntSummaryStatistics statistics = empList.stream()
                .map(Employee::getJobSet)
                //.flatMap(jobSet -> jobSet.stream())
                //.mapToInt(job -> job.getSalary())
                .mapToInt(Employee::sumSalaries)
                .summaryStatistics();
        System.out.printf("Statistic: max = %d, min = %d, average = %f, sum = %d\n",
                statistics.getMax(), statistics.getMin(), statistics.getAverage(), statistics.getSum());
        System.out.println();


        System.out.println("===========================================================================");
        List<Employee> developers = empList.stream()
                .filter(emp -> emp.getJobSet().contains(developer))
                .collect(Collectors.toList());
        List<Employee> drivers = empList.stream()
                .filter(emp -> emp.getJobSet().contains(driver))
                .collect(Collectors.toList());
        List<Employee> teachers = empList.stream()
                .filter(emp -> emp.getJobSet().contains(teacher))
                .collect(Collectors.toList());
        List<Employee> engineers = empList.stream()
                .filter(emp -> emp.getJobSet().contains(engineer))
                .collect(Collectors.toList());
        System.out.println("DEVELOPERS: ");
        developers.forEach(System.out::println);
        System.out.println("DRIVERS: ");
        drivers.forEach(System.out::println);
        System.out.println("TEACHERS: ");
        teachers.forEach(System.out::println);
        System.out.println("ENGINEERS: ");
        engineers.forEach(System.out::println);
        System.out.println("=====================================================================");
        System.out.println();

        int sum = empList.stream()
                .map(Employee::getJobSet)
                .flatMap(Collection::stream)
                .mapToInt(Job::getSalary)
                .sum();
        System.out.println("Зарплата всех сотрудников: " + sum +"\n");

        System.out.println("ЗП по каждому виду работ:");
        Map<String, Integer> group = empList.stream()
                .map(Employee::getJobSet)
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(Job::getName, Collectors.summingInt(Job::getSalary)));
        for(Map.Entry<String, Integer> entry: group.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        System.out.println();

        Map<String, List<String>> collect = empList.stream()
                .collect(Collectors.toMap(Employee::getName, emp -> emp.getJobSet()
                        .stream()
                        .map(Job::getName)
                        .collect(Collectors.toList())));
        for(Map.Entry<String, List<String>> entry: collect.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }

}
