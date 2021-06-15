package lesson5_6_7_OOP.task2interf.shoes;

import lesson5_6_7_OOP.task2interf.interfaces.Shoes;

public class HomeShoes implements Shoes {

    @Override
    public void putOn(){
        System.out.println("Put on home shoes");
    }
    @Override
    public void takeOff(){
        System.out.println("Take off home shoes");
    }
}
