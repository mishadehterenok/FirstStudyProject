package lesson4_OOP.task1;

import lesson4_OOP.task1.Phone;

public class Run {
    public static void main(String[] args) {
        Phone phone = new Phone(5564879,"Iphone 11", 200);

        Phone phone1 = new Phone(6785523,"Sumsung S21",350);

        Phone phone2 = new Phone();
        phone2.setNumber(2289965);
        phone2.setModel("Nokia 2101");
        phone2.setWeight(480);

        phone.displayInfo();
        System.out.println();

        phone1.displayInfo();
        System.out.println();

        phone2.displayInfo();
        System.out.println();


        phone.recieveCall("Max");
        System.out.println("Phone number: " + phone.getNumber());
        System.out.println();

        phone.recieveCall("Alex",8484518);

        phone.sendMessage(6651456,5531485,5552266);
    }
}
