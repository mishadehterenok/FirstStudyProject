package lesson6_7_8_OOP.task2interf.jackets;

import lesson6_7_8_OOP.task2interf.interfaces.Jackets;

public class LeatherJacket implements Jackets {

    @Override
    public void putOn(){
        System.out.println("Put on leather jacket");
    }
    @Override
    public void takeOff(){
        System.out.println("Take off leather jacket");
    }
}
