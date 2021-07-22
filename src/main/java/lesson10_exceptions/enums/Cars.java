package lesson10_exceptions.enums;

import lesson10_exceptions.exceptions.BrokenCarException;

import java.util.Random;

public enum Cars {
    BMW, Mercedes, Audi, Honda;

    String model;
    int speed;
    int price;
    Random ran = new Random();

    Cars() {
        this.speed = ran.nextInt(50) + 200;
        this.price = ran.nextInt(3000) + 2000;
        this.model = toString();
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

    public void start() throws BrokenCarException {
        int num = ran.nextInt(21);
        if (num % 2 == 0) {
            throw new BrokenCarException("Car didn't start. ", num, model);
        } else {
            System.out.printf("Car '%s' started successfully. random number = %d\n", model, num);
        }
    }
}
