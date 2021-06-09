package lesson5_OOP.task7;

public class Application {
    public static void main(String[] args) {
        Veterinar vet = new Veterinar();
        Animal cat = new Cat("milk","Minsk","Cat");
        Animal dog = new Dog("meat","Vitebsk","Dog");
        Animal horse = new Horse("vegetables","Gomel","Horse");
        Animal[] animals = {cat,dog,horse};
        for(Animal animal : animals){
            System.out.println(animal.getName());
            vet.treatAnimal(animal);
        }
    }
}
