package lesson6_7_8_OOP.task1interf.hands;

import lesson6_7_8_OOP.task1interf.interfaces.Hand;

public class SamsungHand implements Hand {
    private int price;

    public SamsungHand() {
    }
    public SamsungHand(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public void upHand(){
        System.out.println("Машет рука от Samsung");
    }
    @Override
    public int getPrice(){
        return this.price;
    }
}

