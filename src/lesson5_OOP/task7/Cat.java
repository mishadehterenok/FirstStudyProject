package lesson5_OOP.task7;

public class Cat extends Animal{
    private String catName;

    public Cat() {
    }

    public Cat(String food, String location, String catName) {
        super(food, location);
        this.catName = catName;
    }
    @Override
    public String getName() {
        return catName;
    }

    public void setName(String catName) {
        this.catName = catName;
    }

    @Override
    public void makeNoise(){
        System.out.print(this.catName);
    }
}
