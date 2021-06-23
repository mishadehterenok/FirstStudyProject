package lesson11_IO.task4;

import java.io.*;

public class DeserializationApp {
    public static final String DIRECTION = "src" + File.separator + "lesson11_IO" + File.separator + "task4" + File.separator;
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DIRECTION + "SerializedPerson.txt"))) {
            Person deserializedPerson = (Person)ois.readObject();
            deserializedPerson.setAge(23);
            System.out.println(deserializedPerson);
            deserializedPerson.setName("Mike");
            deserializedPerson.setAge(18);
            System.out.println(deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
