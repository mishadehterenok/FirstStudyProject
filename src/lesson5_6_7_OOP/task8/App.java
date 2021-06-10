package lesson5_6_7_OOP.task8;

public class App {
    public static void main(String[] args) {
        Circle greenCircle = new Circle("Green",5);
        Rectangle blueRec = new Rectangle("Blue",4,3);
        Circle redCircle = new Circle("Red",7);
        Rectangle brownRec = new Rectangle("Brown",8,5);
        Shape[] figures = {greenCircle,blueRec,redCircle,brownRec};
        for(Shape i : figures){
            i.draw();
            i.equals();
        }
    }
}
