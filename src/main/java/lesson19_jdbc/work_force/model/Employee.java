package lesson19_jdbc.work_force.model;

import java.util.List;

public class Employee {
    private int id;
    private String fullName;
    private List<Job> jobList;

    public Employee() {
    }

    public Employee(int id, String fullName, List<Job> jobList) {
        this.id = id;
        this.fullName = fullName;
        this.jobList = jobList;
    }

    public Employee(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Job> getJobList() {
        return jobList;
    }

    public void setJobList(List<Job> jobList) {
        this.jobList = jobList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", jobList=" + jobList +
                '}';
    }
}
