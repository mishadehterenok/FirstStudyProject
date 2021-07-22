package lesson6_7_8_OOP.task6.vehicles;

import lesson6_7_8_OOP.task6.details.Engine;
import lesson6_7_8_OOP.task6.professions.Driver;

public class SportCar extends Car {

    int speed;

    public SportCar(String mark, String classOfCar, int weight, Driver driver, Engine engine,int speed) {
        super(mark, classOfCar, weight, driver, engine);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
