package lesson5_6_7_OOP.task10nasledovanie;

public class Air extends Transport{
    private int wings;
    private int minRunway;

    public Air() {
    }
    public Air(int power, int maxSpeed, int weight, String model, int wings, int minRunway) {
        super(power, maxSpeed, weight, model);
        this.wings = wings;
        this.minRunway = minRunway;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public int getMinRunway() {
        return minRunway;
    }

    public void setMinRunway(int minRunway) {
        this.minRunway = minRunway;
    }

}
