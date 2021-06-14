package lesson5_6_7_OOP.task1interf;

import lesson5_6_7_OOP.task1interf.interfaces.Hand;
import lesson5_6_7_OOP.task1interf.interfaces.Head;
import lesson5_6_7_OOP.task1interf.interfaces.Leg;
import lesson5_6_7_OOP.task1interf.interfaces.Robot;

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
    @Override
    public void action(){
        head.speak();
        leg.step();
        hand.upHand();
    }
    @Override
    public int getPrice(){
        return head.getPrice() + leg.getPrice() + hand.getPrice();
    }
}