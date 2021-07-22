package lesson12_Collections.shop_bigApp.comparators;

import lesson12_Collections.shop_bigApp.utilities.Product;

import java.util.Comparator;

public class ComparatorByID implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
