package lesson5_OOP.task6.vehicles;

import lesson5_OOP.task6.details.Engine;
import lesson5_OOP.task6.professions.Driver;

public class Car {
    private String mark;
    private String classOfCar;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String mark, String classOfCar, int weight, Driver driver, Engine engine){
               //String name, int exp,int power, int manufacturer) {
        this.mark = mark;
        this.classOfCar = classOfCar;
        this.weight = weight;
        this.driver = driver;
                //new Driver(name,exp);
        this.engine = engine;
                //new Engine(power,manufacturer);
    }
    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Останавливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public void printInfo(){
        System.out.println("Car{" +
                "mark='" + mark + '\'' +
                ", classOfCar='" + classOfCar + '\'' +
                ", weight=" + weight +
                ", driverName='" + driver.getName() +'\''+
                ", driverExp=" + driver.getExp() +
                ", enginePower=" + engine.getPower() +
                ", engineManufacturer='" + engine.getManufacturer() +'\''+
                '}');
    }

}
