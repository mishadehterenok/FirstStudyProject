package lesson13_14_lambda_sream.less;

import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;

public class Employee {
    private String name;
    private int age;
    private Set<Job> jobSet;

    public Employee() {
    }

    public Employee(String name, int age, Set<Job> jobSet) {
        this.name = name;
        this.age = age;
        this.jobSet = jobSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<Job> getJobSet() {
        return jobSet;
    }

    public void setJobSet(Set<Job> jobSet) {
        this.jobSet = jobSet;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", jobSet=" + jobSet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(jobSet, employee.jobSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, jobSet);
    }

}
