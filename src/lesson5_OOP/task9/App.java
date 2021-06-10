package lesson5_OOP.task9;

public class App {
    public static void main(String[] args) {
        Product pr1 = new Product("Apple",2.29,8.2);
        Product pr2 = new Product("Juice",1.99,9.5);
        Product pr3 = new Product("Meat",9.99,7.8);
        Product[] food = {pr1,pr2,pr3};
        Category category1 = new Category("Food",food);
        category1.printCat();
        Product pr4 = new Product("Iphone",3299,9.8);
        Product pr5 = new Product("Imac",4199,9.5);
        Product pr6 = new Product("AppleWatch",2499,9.0);
        Product[] technic = {pr4,pr5,pr6};
        Category category2 = new Category("Technic",technic);
        category2.printCat();
        Product pr7 = new Product("Opel",15499,9.1);
        Product pr8 = new Product("Nissan",21999,8.1);
        Product pr9 = new Product("Tesla",54999,9.95);
        Product[] cars = {pr7,pr8,pr9};
        Category category3 = new Category("Cars",cars);
        category3.printCat();

        Product [] purchased = {pr1,pr3,pr5,pr7,pr9};
        Basket basket = new Basket(purchased);
        User user = new User("m.dkhtrnk@gmail.ru","vbsjhvbi",basket);
        user.printUser();
        basket.printBasket();

    }
}
