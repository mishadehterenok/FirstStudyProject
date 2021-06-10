package lesson5_OOP.task9;

public class Category {
    private String category;
    Product[] products;

    public Category() {
    }

    public Category(String category, Product[] products) {
        this.category = category;
        this.products = products;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public void printCat(){
        System.out.println(category + ":");
        for(Product i: products){
            i.printInfo();
        }
    }
}
