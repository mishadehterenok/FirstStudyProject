package lesson5_6_7_OOP.abilities;

public class Application {
    public static void main(String[] args) {
        Human max = new Human();
        max.setAbilities("Speed","Str");
        max.setName("Max");
        max.printInfo();
    }
}
