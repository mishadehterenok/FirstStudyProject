package lesson6_7_8_OOP.task2interf.pants;

import lesson6_7_8_OOP.task2interf.interfaces.Pants;

public class SportPants implements Pants {
    @Override
    public void putOn(){
        System.out.println("Put on sport pants");
    }
    @Override
    public void takeOff(){
        System.out.println("Take off sport pants");
    }
}
