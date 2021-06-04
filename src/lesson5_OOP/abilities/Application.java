package lesson5_OOP.abilities;

public class Application {
    public static void main(String[] args) {
        Human max = new Human();
        max.setAbilityFirst("Speed");
        max.setAbilitySecond("Str");
        max.setName("Max");
        max.printInfo();

    }
}
