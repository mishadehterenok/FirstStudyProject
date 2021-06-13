package lesson5_6_7_OOP.task10nasledovanie;

public class Application {
    public static void main(String[] args) {
        Light light = new Light(400,220,2100,"Opel Astra",4,4.5,"universal",5);
        light.description();
        light.pathFuel(2.5);
        Cargo cargo = new Cargo(600,140,4300,"Ford Transit",4,6.6,4);
        cargo.description();
        cargo.loadCargo(4600);
        Civil civil = new Civil(850,300,11200,"Boeing",40,5,80,true);
        civil.description();
        civil.loadCivil(68);
        Military military = new Military(1100,450,8450,"Military plane",32,2,true,7);
        military.description();
        military.fire();
        military.bailOut();
    }
}
