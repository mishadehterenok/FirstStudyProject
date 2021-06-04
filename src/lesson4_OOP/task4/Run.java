package lesson4_OOP.task4;

public class Run {
    public static void main(String[] args) {
        Reader rd1 = new Reader("Ivan Ivanov",25,"Economic","20.07.1999",6756562);
        Reader rd2 = new Reader("Petr Petrov",28,"Ecology","01.10.1998",6485593);
        Reader rd3 = new Reader("Natalia Petrova",27,"Engineering","15.03.1995",4425562);
        Reader rd4 = new Reader("Vasia Novikov",26,"Power","27.01.2001",8853366);
        Reader[] readers = {rd1,rd2,rd3,rd4};

        rd1.takeBook(4);
        rd3.returnBook(8);
        rd2.takeBook("Abilities","OOP","Programming");
        rd4.returnBook("Incapsulation","Arrays","Methods","Bite code");

        Book book1 = new Book("Obsession","V.V.Obramov");
        Book book2 = new Book("Our days","K.M.Hobenski");

        rd1.takeBook(book1,book2);
    }
}
