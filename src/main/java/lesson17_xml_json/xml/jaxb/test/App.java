package lesson17_xml_json.xml.jaxb.test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args)  {
        Person person = new Person();
        person.setAge(18);
        person.setName("Ivan");
        try {
            JAXBContext context = JAXBContext.newInstance(Person.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(person,new File(String.valueOf(Paths.get("file.xml"))));

            JAXBContext context1 = JAXBContext.newInstance(Person.class);
            Unmarshaller unmarshaller = context1.createUnmarshaller();
            Person person1 = (Person) unmarshaller.unmarshal(new FileReader(String.valueOf(Paths.get("file.xml"))));
            System.out.println(person1);
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
