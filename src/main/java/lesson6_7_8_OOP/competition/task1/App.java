package lesson6_7_8_OOP.competition.task1;

public class App {
    public static void main(String[] args) {
        Book book1 = new Book("Programming","Novikov");
        Book book2 = new Book("Power","Ivanov");
        Magazine magazine1 = new Magazine("New York Times","Ecology");
        Magazine magazine2 = new Magazine("Science","Medicine");
        Printable[] library ={book1,book2,magazine1,magazine2};
        for(Printable i : library){
            i.print();
        }
        System.out.println();
        Magazine.printMagazines(library);
        System.out.println();
        Book.printBooks(library);




    }
}
