package lesson4_OOP.task4;

public class Reader {
    private String fullName;
    private int userCard;
    private String faculty;
    private String dateOfBirth;
    private int phoneNumber;
    private Book books;

    public Reader(String fullName,int userCard,String faculty,String dateOfBirth,int phoneNumber){
        this.fullName = fullName;
        this.userCard = userCard;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int countBooks) {
        System.out.printf("%s took %d books\n", fullName, countBooks);
    }

    public void takeBook(String... bookName) {
        System.out.print(fullName + " took next books: ");
        for (String i : bookName) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(fullName + " took next books: ");
        for (Book i : books) {
            i.printInfo();
        }
        System.out.println();
    }

    public void returnBook(int countBooks) {
        System.out.printf("%s return %d books\n", fullName, countBooks);
    }

    public void returnBook(String... bookName) {
        System.out.print(fullName + " return next books: ");
        for (String i : bookName) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(fullName + " return next books: ");
        for (Book i : books) {
            i.printInfo();
        }
        System.out.println();
    }
}
