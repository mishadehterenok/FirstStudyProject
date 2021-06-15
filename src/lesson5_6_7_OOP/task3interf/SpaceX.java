package lesson5_6_7_OOP.task3interf;

import java.util.Random;

public class SpaceX implements IStart{
    Random ran = new Random();
    @Override
    public boolean checkOut() {
        if (ran.nextInt(11)*7/3 > 10) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void startEngine(){
        System.out.println("SpaceX's engines are running. All systems  are normal.");
    }
    @Override
    public void start(){
        System.out.println("Start of SpaceX...");
    }
}
