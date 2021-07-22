package lesson6_7_8_OOP.studens;

public class Group {
    private String group;
    private Student[] students;

    public Group(String group, Student[] students) {
        this.group = group;
        this.students = students;
    }
    public void getTotalInfo() {
        for (int i=0; i<students.length; i++) {
            students[i].getInfo();
            System.out.println(", his group is " + group);
        }
    }

}
