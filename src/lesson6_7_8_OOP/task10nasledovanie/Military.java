package lesson6_7_8_OOP.task10nasledovanie;

public class Military extends Air{
    private boolean bailout;
    private int rockets;

    public Military() {
    }
    public Military(int power, int maxSpeed, int weight, String model, int wings, int minRunway, boolean bailout, int rockets) {
        super(power, maxSpeed, weight, model, wings, minRunway);
        this.bailout = bailout;
        this.rockets = rockets;
    }

    public boolean isBailout() {
        return bailout;
    }

    public void setBailout(boolean bailout) {
        this.bailout = bailout;
    }

    public int getRockets() {
        return rockets;
    }

    public void setRockets(int rockets) {
        this.rockets = rockets;
    }

    public void description(){
        System.out.printf("Power: %d h.p. (%.2f kV), max speed: %d km/h, weight: %d kg, model: %s," +
                " wings: %d m, min runway: %d km, bailout: %b, rockets: %d.\n",getPower(),getPower()*0.74, getMaxSpeed(),
                getWeight(),getModel(), getWings(), getMinRunway(), bailout, rockets);
    }
    public void fire(){
        System.out.println("Rockets: " + this.rockets);
        if (rockets == 0){
            System.out.println("No ammunition.");
        }
        else {
            System.out.println("The rocket went...");
        }
    }
    public void bailOut(){
        if (bailout){
            System.out.println("Bailout was successful.");
        }
        else {
            System.out.println("You don't have such a system.");
        }
    }
}
