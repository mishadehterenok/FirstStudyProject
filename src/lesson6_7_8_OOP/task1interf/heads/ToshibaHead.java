package lesson6_7_8_OOP.task1interf.heads;

import lesson6_7_8_OOP.task1interf.interfaces.Head;

public class ToshibaHead implements Head {
    private int price;

    public ToshibaHead() {
    }

    public ToshibaHead(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public void speak(){
        System.out.println("Говорит голова от Toshiba");
    }
    @Override
    public int getPrice(){
        return this.price;
    }
}

