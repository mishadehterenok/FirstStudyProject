package lesson5_6_7_OOP.task1interf;

import lesson5_6_7_OOP.task1interf.hands.SamsungHand;
import lesson5_6_7_OOP.task1interf.hands.SonyHand;
import lesson5_6_7_OOP.task1interf.hands.ToshibaHand;
import lesson5_6_7_OOP.task1interf.heads.SamsungHead;
import lesson5_6_7_OOP.task1interf.heads.SonyHead;
import lesson5_6_7_OOP.task1interf.heads.ToshibaHead;
import lesson5_6_7_OOP.task1interf.legs.SamsungLeg;
import lesson5_6_7_OOP.task1interf.legs.SonyLeg;
import lesson5_6_7_OOP.task1interf.legs.ToshibaLeg;

public class Application {
    Robo robot1 = new Robo(new SamsungHand(15), new SonyHead(35), new ToshibaLeg(20));
    Robo robot2 = new Robo(new ToshibaHand(70),new SamsungHead(20),new SonyLeg(10));
    Robo robot3 = new Robo(new SonyHand(25),new ToshibaHead(50),new SamsungLeg(30));
    Robo [] robots = {robot1,robot2,robot3};
    //for(Robo i: robots){
    //    i.action();
    //}
}

