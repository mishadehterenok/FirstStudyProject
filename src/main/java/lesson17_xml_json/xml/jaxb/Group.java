package lesson17_xml_json.xml.jaxb;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlType(propOrder = {"name","members"})
@XmlRootElement(name = "group")
@XmlAccessorType(XmlAccessType.FIELD)

public class Group {

        private String name;
        @XmlElementWrapper(name = "members")
        @XmlElement(name = "person")
        private List<Person> members = new ArrayList<>();

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Person> getMembers() {
            return members;
        }

        public void setMembers(List<Person> members) {
            this.members = members;
        }

        @Override
        public String toString() {
            return "Group{" +
                    "name='" + name + '\'' +
                    ", members=" + members +
                    '}';
        }
}
