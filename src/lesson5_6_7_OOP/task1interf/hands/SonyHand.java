package lesson5_6_7_OOP.task1interf.hands;

import lesson5_6_7_OOP.task1interf.interfaces.Hand;

public class SonyHand implements Hand {
    private int price;

    public SonyHand() {
    }
    public SonyHand(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void upHand(){
        System.out.println("Машет рука от Sony");
    }
    @Override
    public int getPrice(){
        return this.price;
    }
}
