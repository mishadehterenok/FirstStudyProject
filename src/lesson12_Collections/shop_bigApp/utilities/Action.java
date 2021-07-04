package lesson12_Collections.shop_bigApp.utilities;

import lesson12_Collections.shop_bigApp.comparators.ComparatorByID;
import lesson12_Collections.shop_bigApp.comparators.ComparatorByName;
import lesson12_Collections.shop_bigApp.comparators.ComparatorByPrice;
import lesson12_Collections.shop_bigApp.comparators.ComparatorByType;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Action {
    public static String description;
    public static int N = 1;
    public static final String DIRECTORY = "src" + File.separator + "lesson12_Collections" + File.separator +
            "shop_bigApp" + File.separator + "files" + File.separator;

    public static String[] readFile() {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(DIRECTORY + "productList.txt"))) {
            description = reader.readLine();
            while (reader.ready()) {
                builder.append(reader.readLine()).append("\n");
            }
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
            result[i] = allProducts[num];
            i++;
        }
        return result;
    }


    public static List<Product> makeProductList(String[] lines) {
        List<Product> shopList = new ArrayList<>();
            for (String line : lines) {
                String[] elements = line.split("\\s+");
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
    public static void writeDescription() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DIRECTORY + "finalShop.txt"))) {
            writer.write("N   ID    NAME           PRICE    INFORMATION\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void removeProducts(List<Integer> nums) {
        N = 1;
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(DIRECTORY + "finalShop.txt"))) {
            reader.readLine();
            while (reader.ready()) {
                boolean boo = true;
                String line = reader.readLine();
                String[] elements = line.split("\\s+");
                for (int num : nums) {
                    if (num == Integer.parseInt(elements[0])) {
                        boo = false;
                        break;
                    }
                } if (boo) {
                    builder.append(line).append("\n");
                }
            }
            writeAfterRemoving(makeProductList(builder.toString().split("\n")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void removeAllProducts() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DIRECTORY + "finalShop.txt"))) {
            N = 1;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeAfterRemoving(List<Product> shopList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DIRECTORY + "finalShop.txt"))) {
            writer.write(description + "\n");
            for (Product element : shopList) {
                writer.write(N + element.toString() + "\n");
                N++;
            }
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
