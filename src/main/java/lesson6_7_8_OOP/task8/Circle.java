package lesson6_7_8_OOP.task8;

public class Circle extends Shape {

    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.print(getColor()+" ◯ ");
    }
    @Override
    public void equals(){
        super.equals();
        double pi = 3.14/2;;
        System.out.println(radius * radius*pi);
    }
}
