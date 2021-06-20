package lesson6_7_8_OOP.task8;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public abstract void draw();

    public void equals(){
        System.out.print("Square = ");
    }
    }
