package lesson12_Collections.shop_bigApp.utilities;

import lesson12_Collections.shop_bigApp.utilities.Product;

import java.util.Iterator;
import java.util.List;

public class Shop_notUse {
    private List<Product> shopList;

    public Shop_notUse(List<Product> shopList) {
        this.shopList = shopList;
    }

    public List<Product> getShopList() {
        return shopList;
    }

    public void addItem(Product product) {
        if (!shopList.contains(product)) {
            shopList.add(product);
        }
        System.out.println("Illegal ID");
    }

    public void printAllIProducts() {
        for (Product i : shopList) {
            System.out.println(i);
        }
    }

    public void removeProduct(int id) {
        Iterator<Product> iterator = shopList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
            }
        }
    }

    public void editProduct(Product product) {
        for (Product i : shopList) {
            if (i.getId() == product.getId()) {
                i.setPrice(product.getPrice());
                i.setName(product.getName());
                i.setType(product.getType());
            }
        }
    }
    public void printReverseList(){
        for (int i = shopList.size()-1; i >=0 ; i--) {
            System.out.println(shopList.get(i));

        }
    }
}
