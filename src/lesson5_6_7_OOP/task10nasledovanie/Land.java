package lesson5_6_7_OOP.task10nasledovanie;

public class Land extends Transport{
    private int wheels;
    private double fuelConsumption;

    public Land() {
    }

    public Land(int power, int maxSpeed, int weight, String model, int wheels, double fuelConsumption) {
        super(power, maxSpeed, weight, model);
        this.wheels = wheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

}
