package lesson6_7_8_OOP.task2interf;

import lesson6_7_8_OOP.task2interf.jackets.LeatherJacket;
import lesson6_7_8_OOP.task2interf.jackets.WinterJacket;
import lesson6_7_8_OOP.task2interf.pants.OfficePants;
import lesson6_7_8_OOP.task2interf.pants.SportPants;
import lesson6_7_8_OOP.task2interf.shoes.HomeShoes;
import lesson6_7_8_OOP.task2interf.shoes.SportShoes;

public class App {
    public static void main(String[] args) {
        Human h1 = new Human("Mike",new LeatherJacket(),new OfficePants(),new HomeShoes());
        Human h2 = new Human("John",new WinterJacket(),new SportPants(),new SportShoes());
        Human[] hum = {h1,h2};
        for(Human i: hum){
            System.out.println(i.getName());
            i.putOnAll();
            i.takeOffAll();
        }

    }
}
