package lesson5_6_7_OOP.task2interf.shoes;

import lesson5_6_7_OOP.task2interf.interfaces.Shoes;

public class SportShoes implements Shoes {

    @Override
    public void putOn(){
        System.out.println("Put on sport shoes");
    }
    @Override
    public void takeOff(){
        System.out.println("Take off sport shoes");
    }
}
