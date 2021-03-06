package lesson6_7_8_OOP.task8;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void draw() {
        System.out.print(getColor()+" ▭ ");
        }
    @Override
    public void equals(){
        super.equals();
        System.out.println(width*height);
    }
    }


