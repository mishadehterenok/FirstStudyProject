package lesson17_xml_json.xml.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.marshallExample();
        app.unmarshallExample();
        System.out.println("Done");
    }

    public static Group createGroup() {
        Group group = new Group();
        group.setName("Test Group 1");
        group.getMembers().add(new Person("Denis", "Derka", LocalDate.of(2000,12, 5)));
        group.getMembers().add(new Person("Vasya", "Kima",LocalDate.of(1999,7,10)));
        return group;
    }

    public void marshallExample() {
        try {
            File fileIn = new File("src/main/java/lesson17_xml_json/xml/jaxb/XMLfile.xml");
            JAXBContext context = JAXBContext.newInstance(Group.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(createGroup(), fileIn);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void unmarshallExample() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Group.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            InputStream inStream = new FileInputStream("src/main/java/lesson17_xml_json/xml/jaxb/XMLfile.xml");
            Group group = (Group) jaxbUnmarshaller.unmarshal(inStream);
            System.out.println(group);
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
