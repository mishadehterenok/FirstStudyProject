package lesson5_OOP.task2;

import lesson6_7_8_OOP.task6.professions.Driver;

public class Person extends Driver {
    private int age;

    public Person() {
    }

    public Person(String name,int exp, int age) {
        super(name,exp);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move(){
        System.out.println(getName() + ", "+age+" лет, идет.");
    }
    public void talk(){
        System.out.println(getName() + ", "+age+" лет, говорит.");
    }

}
