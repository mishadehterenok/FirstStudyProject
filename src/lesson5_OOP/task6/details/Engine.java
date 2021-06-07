package lesson5_OOP.task6.details;

public class Engine {
    private int power;
    private int manufacturer;

    public Engine(){

    }

    public Engine(int power, int manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(int manufacturer) {
        this.manufacturer = manufacturer;
    }
}
