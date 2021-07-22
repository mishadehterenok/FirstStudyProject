package lesson6_7_8_OOP.task1interf.hands;

import lesson6_7_8_OOP.task1interf.interfaces.Hand;

public class ToshibaHand implements Hand {
    private int price;

    public ToshibaHand() {
    }

    public ToshibaHand(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public void upHand(){
        System.out.println("Машет рука от Toshiba");
    }
    @Override
    public int getPrice(){
        return this.price;
    }
}

