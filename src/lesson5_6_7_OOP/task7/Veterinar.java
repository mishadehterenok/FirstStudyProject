package lesson5_6_7_OOP.task7;

public class Veterinar {
    private Animal animal;

    public Veterinar() {
    }
    public Veterinar(Animal animal) {
        this.animal = animal;
    }
    public void treatAnimal(Animal animal){
        System.out.println("Food: " + animal.getFood());
        System.out.println("Location: " + animal.getLocation());
        System.out.println();
    }
}
