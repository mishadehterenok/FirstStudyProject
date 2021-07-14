package lesson13_14_lambda_sream.mainTask;

import java.util.Objects;

public class Job {
    private String name;
    private int salary;

    public Job() {
    }

    public Job(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return
                name + " - " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return salary == job.salary && Objects.equals(name, job.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}
