package lesson5_6_7_OOP.task1interf.legs;

import lesson5_6_7_OOP.task1interf.interfaces.Leg;

public class SonyLeg implements Leg {
    private int price;

    public SonyLeg() {
    }

    public SonyLeg(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public void step(){
        System.out.println("Шагает нога от Sony");
    }
    @Override
    public int getPrice(){
        return this.price;
    }
}
