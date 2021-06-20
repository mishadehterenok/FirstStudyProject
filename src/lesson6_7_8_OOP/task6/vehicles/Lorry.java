package lesson6_7_8_OOP.task6.vehicles;

import lesson6_7_8_OOP.task6.details.Engine;
import lesson6_7_8_OOP.task6.professions.Driver;

public class Lorry extends Car {

    int loadCapacity;

    public Lorry(String mark, String classOfCar, int weight, Driver driver, Engine engine, int loadCapacity) {
        super(mark, classOfCar, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
