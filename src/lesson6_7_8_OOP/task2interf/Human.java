package lesson6_7_8_OOP.task2interf;

import lesson6_7_8_OOP.task2interf.interfaces.Jackets;
import lesson6_7_8_OOP.task2interf.interfaces.Pants;
import lesson6_7_8_OOP.task2interf.interfaces.Shoes;


public class Human {
    private String name;
    private Jackets jacket;
    private Pants pants;
    private Shoes shoes;

    public Human() {
    }
    public Human(String name, Jackets jacket, Pants pants, Shoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJacket(Jackets jacket) {
        this.jacket = jacket;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public void putOnAll(){
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }
    public void takeOffAll(){
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
