package lesson6_7_8_OOP.competition.task4;

public class Tshirt extends Clothes implements WomensClothes,MensClothes{

    public Tshirt(int size, int cost, String color,String name) {
        super(size, cost, color,name);
    }
    public void dressMen(){
        System.out.println("Мужчина в майке");
    }
    public void dressWomen(){
        System.out.println("Женщина в майке");
    }



}
