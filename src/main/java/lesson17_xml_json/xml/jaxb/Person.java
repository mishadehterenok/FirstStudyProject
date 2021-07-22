package lesson17_xml_json.xml.jaxb;


import javax.xml.bind.annotation.XmlType;



@XmlType(propOrder = {"firstName", "lastName"})
public class Person {
    //@XmlJavaTypeAdapter(value = LocalDateAdapter.class, type = LocalDate.class)
    //private LocalDate birthDay;
    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        //this.birthDay = birthDay;
        this.firstName = firstName;
        this.lastName = lastName;
    }

//    public LocalDate getBirthDay() {
//        return birthDay;
//    }

//    public void setBirthDay(LocalDate birthDay) {
//        this.birthDay = birthDay;
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                //"birthDay=" + birthDay +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}
