package lesson5_6_7_OOP.task9;

public class Basket {
    private Product[] purchased;

    public Basket() {
    }

    public Basket(Product[] purchased) {
        this.purchased = purchased;
    }

    public Product[] getPurchased() {
        return purchased;
    }

    public void setPurchased(Product[] purchased) {
        this.purchased = purchased;
    }
    public void printBasket(){
        System.out.println("Basket:");
        for(Product i: purchased){
            i.printInfo();
        }
    }
}
