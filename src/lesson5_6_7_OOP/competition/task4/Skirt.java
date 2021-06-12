package lesson5_6_7_OOP.competition.task4;

public class Skirt extends Clothes implements WomensClothes{

    public Skirt (int size, int cost, String color,String name) {
        super(size, cost, color,name);
    }
    @Override
    public void dressWomen() {
        System.out.println("Женщина в юбке");
    }

}
