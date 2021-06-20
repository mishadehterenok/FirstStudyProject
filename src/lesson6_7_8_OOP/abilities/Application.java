package lesson6_7_8_OOP.abilities;

public class Application {
    public static void main(String[] args) {
        Human max = new Human();
        max.setAbilities("Speed","Str");
        max.setName("Max");
        max.printInfo();
    }
}
