package lesson6_7_8_OOP.task1interf;

import lesson6_7_8_OOP.task1interf.interfaces.Hand;
import lesson6_7_8_OOP.task1interf.interfaces.Head;
import lesson6_7_8_OOP.task1interf.interfaces.Leg;
import lesson6_7_8_OOP.task1interf.interfaces.Robot;

public class Robo implements Robot {
    private Hand hand;
    private Head head;
    private Leg leg;

    public Robo() {
    }

    public Robo(Hand hand, Head head, Leg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }
    static int  count = 1;
    @Override
    public void action(){

        System.out.println("Робот #" + count);
        head.speak();
        leg.step();
        hand.upHand();
        count++;
    }
    @Override
    public int getPrice(){
        return head.getPrice() + leg.getPrice() + hand.getPrice();
    }

    public static void getMaxPrice(Robo[] robots){
        int max = robots[0].getPrice();
        for (int i = 0; i <robots.length ; i++) {
            if (max < robots[i].getPrice()){
                max = robots[i].getPrice();
            }
        }
        for (int i = 0; i <robots.length ; i++) {
            if (max == robots[i].getPrice()){
                System.out.printf("Самый дорогой робот #%d, его цена = %d\n",i+1,max);
            }
        }
    }
}
