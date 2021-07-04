package lesson12_Collections.shop_bigApp.comparators;

import lesson12_Collections.shop_bigApp.utilities.Product;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
