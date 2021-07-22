package lesson5_OOP.task2;

public class Run {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Vasia Petrov");
        person1.setAge(23);
        Person person2 = new Person("Ivan Ivanov", 25,6);
        person2.move();
        person2.talk();
        person1.move();
        person1.talk();
    }
}
