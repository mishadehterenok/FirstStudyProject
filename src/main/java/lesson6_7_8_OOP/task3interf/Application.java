package lesson6_7_8_OOP.task3interf;

public class Application {
    public static void main(String[] args) {
        Cosmodrom.launch(new SpaceX());
        Cosmodrom.launch(new Shuttle());
    }
}
