package lesson5_OOP.task1;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(int number) {
        // System.out.println(number);
        this.number = number;
    }

    public Phone(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model, int weight) {
        this(model, weight);
        this.number = number;
        //this.model = model;
        //this.weight = weight;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void displayInfo() {
        System.out.printf("Number: %d \nModel: %s\nWeight: %d\n", number, model, weight);
    }

    public void recieveCall(String name) {
        System.out.println(name + " is calling");
    }

    public void recieveCall(String name, int number) {
        System.out.println(name + " is calling \n" + "Phone number: " + number);
        System.out.println();
    }

    public void sendMessage(int... number) {
        for (int i : number) {
            System.out.println("The message sent to number " + i);
        }
    }
}
