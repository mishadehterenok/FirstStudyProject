package lesson6_7_8_OOP.task1interf.legs;

import lesson6_7_8_OOP.task1interf.interfaces.Leg;

public class SamsungLeg implements Leg{
    private int price;

    public SamsungLeg() {
    }

    public SamsungLeg(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public void step(){
        System.out.println("Шагает нога от Samsung");
    }
    @Override
    public int getPrice(){
        return this.price;
    }
}
