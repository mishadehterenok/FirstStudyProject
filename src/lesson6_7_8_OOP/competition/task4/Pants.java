package lesson6_7_8_OOP.competition.task4;

public class Pants extends Clothes implements WomensClothes,MensClothes{

    public Pants(int size, int cost, String color,String name) {
        super(size, cost, color,name);
    }
    @Override
    public void dressMen() {
        System.out.println("Мужчина в штанах");
    }
    @Override
    public void dressWomen() {
        System.out.println("Женщина в штанах");
    }
}
