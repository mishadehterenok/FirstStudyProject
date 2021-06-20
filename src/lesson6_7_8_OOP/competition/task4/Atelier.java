package lesson6_7_8_OOP.competition.task4;

public class Atelier {
    public static void dressMen (Clothes [] clothes){
        System.out.println("Мужская одежда:");
        for(Clothes i: clothes){
            if (i instanceof MensClothes){
                i.printInfo();
            }
        }
    }
    public static void dressWomen (Clothes [] clothes){
        System.out.println("Женская одежда:");
        for(Clothes i: clothes){
            if (i instanceof WomensClothes){
                i.printInfo();
            }
        }
    }
}

