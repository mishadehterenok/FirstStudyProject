package lesson5_OOP.studens;

public class Application {
    public static void main(String[] args) {
        Student st1 = new Student("John", 18, 8.9);
        Student st2 = new Student("Jeremy", 19, 9.0);
        Student st3 = new Student("Bill", 17, 7.9);
        Student st4 = new Student("Poll", 19, 9.0);
        Student[] students = {st1,st2,st3,st4};

        Group team = new Group("10602217", students);
        team.getTotalInfo();
    }
}
