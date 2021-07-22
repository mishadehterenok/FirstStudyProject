package lesson6_7_8_OOP.task1interf.heads;

import lesson6_7_8_OOP.task1interf.interfaces.Head;

public class SonyHead implements Head {
    private int price;

    public SonyHead() {
    }

    public SonyHead(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public void speak(){
        System.out.println("Говорит голова от Sony");
    }
    @Override
    public int getPrice(){
        return this.price;
    }
}

