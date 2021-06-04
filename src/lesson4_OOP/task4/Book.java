package lesson4_OOP.task4;

public class Book {
    private String book;
    private String author;

    Book(String book, String author){
        this.author=author;
        this.book = book;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void printInfo(){
        System.out.printf("author: %s - %s, \n",author,book);
    }

}
