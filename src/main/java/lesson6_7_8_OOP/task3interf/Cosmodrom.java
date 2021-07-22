package lesson6_7_8_OOP.task3interf;

public class Cosmodrom {

    public static void launch(IStart start) {
        if (start.checkOut()) {
            start.startEngine();
            for (int i = 10; i > 0 ; i--) {
                System.out.println(i);
            }
            start.start();
        } else {
            System.out.println("pre-launch check failed");
        }
    }

}
