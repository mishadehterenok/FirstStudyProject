package lesson10_exceptions;

public class Application {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 220, 4500);
        Car car2 = new Car("Mercedes", 220, 6000);
        Car car3 = new Car("Audi", 220, 7000);
        Car car4 = new Car("Honda", 220, 4000);
        Car[] cars = {car1, car2, car3, car4};

        CarHandler.handler(cars);
    }
}
