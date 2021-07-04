package lesson12_Collections.shop_bigApp.utilities;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private int number;
    private int id;
    private String name;
    private int price;
    Type type;

    public Product(Integer integer) {
    }

    public Product(int id, String name, int price, Type type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static String printSpaces(int num){
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <=num; i++) {
            builder.append(" ");
        } return builder.toString();
    }


    @Override
    public String toString() {
        int a = 4 - String.valueOf(Action.N).length();
        int b = 15 - getName().length();
        int c = 9 - String.valueOf(getPrice()).length();
        return printSpaces(a) + id +"   " + name + printSpaces(b) + price + printSpaces(c) + type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(getId(), o.getId());
    }
}
