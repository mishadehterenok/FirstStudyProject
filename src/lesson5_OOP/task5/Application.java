package lesson5_OOP.task5;

public class Application {
    public static void main(String[] args) {
        Student student1 = new Aspirant("Ivan", "Ivanov", 105, 5, "Programming");
        Student student2 = new Student("Vasia", "Vasiliev", 108, 5);
        Student student3 = new Aspirant("Kostia", "Ivanov", 204, 5, "Engineering");
        Student[] students = {student1, student2, student3};
        for (Student i : students) {
            System.out.print(i.getFirstName() + " ");
            System.out.println(i.getScholarship());
        }
        Aspirant asp = (Aspirant) student1;
        System.out.println(asp.getScienceWork());
    }
}
