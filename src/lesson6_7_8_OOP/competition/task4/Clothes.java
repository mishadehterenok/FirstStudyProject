package lesson6_7_8_OOP.competition.task4;

public abstract class Clothes {
    private String name;
    private int size;
    private int cost;
    private String color;

    public Clothes() {
    }
    public Clothes(int size, int cost, String color,String name) {
        this.size = size;
        this.cost = cost;
        this.color = color;
        this.name = name;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.printf("%s - size: %d, cost: %d, color: %s\n",name,size,cost,color);
    }


}
