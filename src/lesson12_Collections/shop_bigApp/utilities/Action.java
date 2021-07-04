package lesson12_Collections.shop_bigApp.utilities;

import lesson12_Collections.shop_bigApp.comparators.ComparatorByID;
import lesson12_Collections.shop_bigApp.comparators.ComparatorByName;
import lesson12_Collections.shop_bigApp.comparators.ComparatorByPrice;
import lesson12_Collections.shop_bigApp.comparators.ComparatorByType;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Action {
    public static int N = 1;
    public static final String DIRECTORY = "src" + File.separator + "lesson12_Collections" + File.separator +
            "shop_bigApp" + File.separator + "files" + File.separator;

    public static String[] readFile() {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(DIRECTORY + "productList.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter(DIRECTORY + "finalShop.txt",true))) {
            final String description = reader.readLine();
            while (reader.ready()) {
                builder.append(reader.readLine()).append("\n");
            }
            writer.write(description + "\n");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return builder.toString().split("\n");
    }

    public static String[] makeSpecialSetOfProducts(String[] allProducts, List<Integer> numbers) {
        int i = 0;
        String[] result = new String[numbers.size()];
        for (int num : numbers) {
            result[i] = allProducts[num-1];
            i++;
        }
        return result;
    }


    public static List<Product> makeProductList(String[] lines) {
        List<Product> shopList = new ArrayList<>();
            for (String line : lines) {
                String[] elements = line.split("\\s{2,}");
                Product product = new Product(Integer.parseInt(elements[1]), elements[2], Integer.parseInt(elements[3]), Type.valueOf(elements[4]));
                shopList.add(product);
            }
        return shopList;
    }

    public static void writeProducts(List<Product> shopList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DIRECTORY + "finalShop.txt", true))) {
            for (Product element : shopList) {
                writer.write(N + element.toString() + "\n");
                N++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void removeProducts(List<Integer> nums) {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(DIRECTORY + "finalShop.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter(DIRECTORY + "finalShop.txt"))) {
            final String description = reader.readLine();
            while (reader.ready()) {
                for (int i : nums) {
                    String line = reader.readLine();
                    if (i != Integer.parseInt(line.substring(0, 2))) {
                        builder.append(line).append("\n");
                    }
                }
            }
            writer.write(description + "\n");
            N = 1;
            writeProducts(makeProductList(builder.toString().split("\n")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void removeAllProducts() {
        try (BufferedReader reader = new BufferedReader(new FileReader(DIRECTORY + "productList.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter(DIRECTORY + "finalShop.txt"))) {
            final String description = reader.readLine();
            writer.write(description + "\n");
            N = 1;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public static List<Product> SortByID(List<Product> productList) {
        productList.sort(new ComparatorByID());
        return productList;
    }

    public static List<Product> SortByName(List<Product> productList) {
        productList.sort(new ComparatorByName());
        return productList;
    }

    public static List<Product> SortByPrice(List<Product> productList) {
        productList.sort(new ComparatorByPrice());
        return productList;
    }

    public static List<Product> SortByType(List<Product> productList) {
        productList.sort(new ComparatorByType());
        return productList;
    }
}
