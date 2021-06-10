package lesson5_6_7_OOP.task6.vehicles;

import lesson5_6_7_OOP.task6.details.Engine;
import lesson5_6_7_OOP.task6.professions.Driver;

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
