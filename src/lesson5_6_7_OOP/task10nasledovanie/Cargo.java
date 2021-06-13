package lesson5_6_7_OOP.task10nasledovanie;

public class Cargo extends Land{
    private int liftingCapacity;

    public Cargo() {
    }

    public Cargo(int power, int maxSpeed, int weight, String model, int wheels, double fuelConsumption, int liftingCapacity) {
        super(power, maxSpeed, weight, model, wheels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }
    @Override
    public void description(){
        System.out.printf("Power: %d h.p. (%.2f kV), max speed: %d km/h, weight: %d kg, model: %s," +
                        " wheels: %d, fuel consumption: %.2f l/100km, lifting capacity: %d t.\n"
                ,getPower(),getPower()*0.74, getMaxSpeed(), getWeight(),getModel(), getWheels(),
                getFuelConsumption(),liftingCapacity);
    }
    public void loadCargo(int cargo){
        System.out.println("Cargo weight: " + cargo +" kg.");
        if (cargo <= liftingCapacity*1000){
            System.out.println("Truck loaded.");
        }
        else {
            System.out.println("You need a bigger truck.");
        }
    }

}
