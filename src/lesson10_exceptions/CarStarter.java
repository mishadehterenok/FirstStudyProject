package lesson10_exceptions;

import lesson10_exceptions.enums.Cars;
import lesson10_exceptions.exceptions.BrokenCarException;

public class CarStarter {
    public static void startMachines(){
        Cars [] cars = Cars.values();

        int count = 0;
        for(Cars i: cars){
            try{
                i.start();
                count++;
            }
            catch (BrokenCarException e){
                System.out.println(e);
            } finally {
                System.out.println("Price: " + i.getPrice() + "$, max speed: " + i.getSpeed() + "km/h\n");
            }
        }
        System.out.printf("\nStarted %d cars\n",count);
    }
}
