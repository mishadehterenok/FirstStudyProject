package lesson12_Collections.shop_bigApp.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static lesson12_Collections.shop_bigApp.utilities.Action.*;

public class Control {
    static Scanner scanner = new Scanner(System.in);

    public static void START() {
        System.out.println("Введите необходимую команду из списка:\n" +
                "- Добавить все продукты\n" +
                "- Добавить продукты\n" +
                "- Удалить все продукты\n" +
                "- Удалить продукты\n" +
                "(Для выхода введите 'Выход')\n");
        while (true) {
            String mainCommand = scanner.nextLine();
            if (mainCommand.equalsIgnoreCase("Добавить все продукты")) {
                sortDescription();
                String line = scanner.nextLine();
                if (line.equalsIgnoreCase("По идентификатору")) {
                    writeProducts(SortByID(makeProductList(readFile())));
                    System.out.println("Все продукты добавлены");
                } else if (line.equalsIgnoreCase("По названию")) {
                    writeProducts(SortByName(makeProductList(readFile())));
                    System.out.println("Все продукты добавлены");
                } else if (line.equalsIgnoreCase("По цене")) {
                    writeProducts(SortByPrice(makeProductList(readFile())));
                    System.out.println("Все продукты добавлены");
                } else if (line.equalsIgnoreCase("По типу")) {
                    writeProducts(SortByType(makeProductList(readFile())));
                    System.out.println("Все продукты добавлены");
                } else if (line.equalsIgnoreCase("Выход")) {
                    scanner.close();
                    break;
                } else System.out.println("Неверная команда, попробуйте еще раз...");
            } else if (mainCommand.equalsIgnoreCase("Добавить продукты")) {
                System.out.println("Введите номера продуктов для добавления (для выхода введите 0)");
                List<Integer> intList = readNumbers();
                sortDescription();
                String line = scanner.nextLine();
                if (line.equalsIgnoreCase("По идентификатору")) {
                    writeProducts(SortByID(makeProductList((makeSpecialSetOfProducts(readFile(), intList)))));
                    System.out.println("Выбранные продукты добавлены");
                } else if (line.equalsIgnoreCase("По названию")) {
                    writeProducts(SortByName(makeProductList((makeSpecialSetOfProducts(readFile(), intList)))));
                    System.out.println("Выбранные продукты добавлены");
                } else if (line.equalsIgnoreCase("По цене")) {
                    writeProducts(SortByPrice(makeProductList((makeSpecialSetOfProducts(readFile(), intList)))));
                    System.out.println("Выбранные продукты добавлены");
                } else if (line.equalsIgnoreCase("По типу")) {
                    writeProducts(SortByType(makeProductList((makeSpecialSetOfProducts(readFile(), intList)))));
                    System.out.println("Выбранные продукты добавлены");
                } else if (line.equalsIgnoreCase("Выход")) {
                    scanner.close();
                    break;
                } else System.out.println("Неверная команда, попробуйте еще раз...");
            } else if (mainCommand.equalsIgnoreCase("Удалить все продукты")) {
                removeAllProducts();
                System.out.println("Все продукты удалены");
            } else if (mainCommand.equalsIgnoreCase("Удалить продукты")) {
                System.out.println("Введите номера продуктов для удаления (для выхода введите 0)");
                List<Integer> integerList = readNumbers();
                removeProducts(integerList);
                System.out.println("Выбранные продукты удалены");
            } else if (mainCommand.equalsIgnoreCase("Выход")) {
                scanner.close();
                break;
            } else {
                System.out.println("Неверная команда, попробуйте еще раз...");
            }
        }
    }

    public static void sortDescription() {
        System.out.println("Каким способом хотите отсортировать продукты?\n Доступны:\n" +
                "- По идентификатору\n- По названию\n- По цене\n- По типу\n");
    }

    public static List<Integer> readNumbers() {
        List<Integer> nums = new ArrayList<>();
        while (true) {
            int number = scanner.nextInt();
            if (number <= 0) {
                break;
            }
            nums.add(number);
        }
        return nums;
    }
}
