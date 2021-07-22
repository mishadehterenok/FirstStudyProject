package lesson6_7_8_OOP.task3interf;

import java.util.Random;

public class Shuttle implements IStart {
    Random ran = new Random();
    @Override
    public boolean checkOut() {
        if (ran.nextInt(11) > 3) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void startEngine(){
        System.out.println("Shuttle's engines are running. All systems  are normal.");
    }
    @Override
    public void start(){
        System.out.println("Start of shuttle");
    }
}
