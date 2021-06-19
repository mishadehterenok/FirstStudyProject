package lesson10_exceptions;

import lesson10_exceptions.exceptions.BrokenCarException;

import java.util.Random;

public class Car {
    private String model;
    private int speed;
    private double price;

    public Car(String model, int speed, double price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void start() throws BrokenCarException {
        Random ran = new Random();
        int num = ran.nextInt(21);
        if (num % 2 == 0) {
            throw new BrokenCarException("Car didn't start. ",num, model);
        } else {
            System.out.printf("Car %s started successfully. number = %d\n", model,num);
        }
    }
}
