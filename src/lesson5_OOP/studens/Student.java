package lesson5_OOP.studens;

public class Student {
    private String name;
    private int age;
    private double averScore;

    public Student (String name, int age, double averScore) {
        this.name = name;
        this.age = age;
        this.averScore = averScore;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAverScore(double averScore) {
        this.averScore = averScore;
    }

    public void getInfo () {
        System.out.printf("Student: %s, %d ages, average score is %f", name, age, averScore);
    }

}
