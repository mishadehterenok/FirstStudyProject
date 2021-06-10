package lesson5_6_7_OOP.competition.task1;

public class Book implements Printable{
    private String bookName;
    private String author;

    public Book() {
    }

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public void print(){
        System.out.printf("Book: %s, author: %s\n",bookName,author);
    }
    public static void printBooks(Printable[] printables){
        for(Printable i: printables){
            if (i instanceof Book ){
            i.print();
        }
    }}
}
