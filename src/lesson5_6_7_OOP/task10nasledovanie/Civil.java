package lesson5_6_7_OOP.task10nasledovanie;

public class Civil extends Air{
    private int passengers;
    private boolean businessClass;

    public Civil() {
    }
    public Civil(int power, int maxSpeed, int weight, String model, int wings, int minRunway, int passengers, boolean businessClass) {
        super(power, maxSpeed, weight, model, wings, minRunway);
        this.passengers = passengers;
        this.businessClass = businessClass;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }
    @Override
    public void description(){
        System.out.printf("Power: %d h.p. (%.2f kV), max speed: %d km/h, weight: %d kg, model: %s," +
                        " wings: %d m, min runway: %d km, passenger capacity: %d, business class: %b.\n",getPower(),getPower()*0.74, getMaxSpeed(),
                getWeight(),getModel(), getWings(), getMinRunway(),passengers,businessClass);
    }
    public void loadCivil(int passengers){
        System.out.println("Passengers: " + passengers);
        if (passengers <= this.passengers){
            System.out.println("Plane loaded.");
        }
        else {
            System.out.println("You need a bigger plane.");
        }
    }

}
