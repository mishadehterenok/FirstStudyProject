package lesson10_exceptions;

import lesson10_exceptions.exceptions.BrokenCarException;

public class CarHandler {
    public static void handler(Car[] cars){
        int count = 0;
        for(Car i: cars){
            try{
                i.start();
                count++;
            }
            catch (BrokenCarException e){
                System.out.println(e);
            }
        }
        System.out.printf("\nStarted %d cars\n",count);
    }
}
