package lesson6_7_8_OOP.task7;

public class Horse extends Animal{
    private String horseName;

    public Horse() {
    }
    public Horse(String food, String location, String horseName) {
        super(food, location);
        this.horseName = horseName;
    }
@Override
    public String getName() {
        return horseName;
    }

    public void setName(String horseName) {
        this.horseName = horseName;
    }

    @Override
    public void makeNoise(){
        System.out.print(this.horseName);
    }
}
