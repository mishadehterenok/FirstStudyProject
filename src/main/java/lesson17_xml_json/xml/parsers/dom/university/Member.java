package lesson17_xml_json.xml.parsers.dom.university;

public class Member extends Human{
    private String position;

    public Member(String name, String position) {
        super(name);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public String toString() {
        return "Сотрудник обслуживающего персонала " + getName() + ", должность: " + position;
    }
}
