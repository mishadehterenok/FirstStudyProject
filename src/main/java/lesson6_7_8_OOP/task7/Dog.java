package lesson6_7_8_OOP.task7;

public class Dog extends Animal{
    private String dogName;

    public Dog() {
    }

    public Dog(String food, String location, String dogName) {
        super(food, location);
        this.dogName = dogName;
    }
@Override
    public String getName() {
        return dogName;
    }

    public void setName(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public void makeNoise(){
        System.out.print(this.dogName);
    }
}
