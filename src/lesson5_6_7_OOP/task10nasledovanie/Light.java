package lesson5_6_7_OOP.task10nasledovanie;

public class Light extends Land{
    private String body;
    private int passengers;

    public Light() {
    }
    public Light(int power, int maxSpeed, int weight, String model, int wheels, double fuelConsumption, String body, int passengers) {
        super(power, maxSpeed, weight, model, wheels, fuelConsumption);
        this.body = body;
        this.passengers = passengers;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    @Override
    public void description(){
        System.out.printf("Power: %d h.p. (%.2f kV), max speed: %d km/h, weight: %d kg, model: %s," +
                        " wheels: %d, fuel consumption: %.2f l/100km, car body: %s, passengers: %d.\n"
                ,getPower(),getPower()*0.74, getMaxSpeed(), getWeight(),getModel(), getWheels(),
                getFuelConsumption(),body,passengers);
    }
    private double countFuelCons(double distance){
        return distance*getFuelConsumption()/100;
    }
    public void pathFuel (double time){
        System.out.printf("During %.2f hours, car %s moving at maximum speed %d km/h will pass %.2f km and consume %.2f liters of fuel.\n"
        ,time,getModel(),getMaxSpeed(),getMaxSpeed()*time,countFuelCons(getMaxSpeed()*time));
    }

}
