package lesson5_OOP.task6.professions;

public class Driver {
    private String name;
    private int exp;

    public Driver(){

    }

    public Driver(String name, int exp) {
        this.name = name;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
