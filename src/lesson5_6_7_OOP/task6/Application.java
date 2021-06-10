package lesson5_6_7_OOP.task6;

import lesson5_6_7_OOP.task6.details.Engine;
import lesson5_6_7_OOP.task6.professions.Driver;
import lesson5_6_7_OOP.task6.vehicles.Car;

public class Application {
    public static void main(String[] args) {
        Driver driver = new Driver("Max",5);
        Engine engine = new Engine(750,"Germany");
        Car car = new Car("Opel","universal",200,driver,engine);
        car.printInfo();



    }
}
