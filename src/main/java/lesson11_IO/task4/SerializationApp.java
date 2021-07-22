package lesson11_IO.task4;

import java.io.*;

public class SerializationApp {
    public static final String DIRECTION = "src" + File.separator + "lesson11_IO" + File.separator + "task4" + File.separator;
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DIRECTION + "SerializedPerson.txt"))) {
            Person person = new Person("Max",25,true);
            oos.writeObject(person);
            System.out.println(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
