package lesson12_Collections.shop_bigApp.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static lesson12_Collections.shop_bigApp.utilities.Action.*;

public class Control {
    static Scanner scanner = new Scanner(System.in);

    public static void START() {
        System.out.println("Введите необходимую команду из списка:\n" +
                "- 'Добавить все продукты'\n" +
                "- 'Создать список' (создается новый список продуктов)\n" +
                "- 'Добавить продукты' (добавляются в конец списка)\n" +
                "- 'Удалить все продукты'\n" +
                "- 'Удалить продукты' (удаляются выбранные продукты, а остальные сортируются по-новому)\n" +
                "(Для выхода введите 'ВЫХОД')\n");
        while (true) {
            String mainCommand = scanner.nextLine();
            if (mainCommand.equalsIgnoreCase("Добавить все продукты")) {
                sortDescription();
                writeDescription();
                while (true) {
                    String line = scanner.nextLine();
                    if (line.equalsIgnoreCase("По идентификатору")) {
                        writeProducts(SortByID(makeProductList(readFile())));
                        allSuccess();
                        break;
                    } else if (line.equalsIgnoreCase("По названию")) {
                        writeProducts(SortByName(makeProductList(readFile())));
                        allSuccess();
                        break;
                    } else if (line.equalsIgnoreCase("По цене")) {
                        writeProducts(SortByPrice(makeProductList(readFile())));
                        allSuccess();
                        break;
                    } else if (line.equalsIgnoreCase("По типу")) {
                        writeProducts(SortByType(makeProductList(readFile())));
                        allSuccess();
                        break;
                    } else if (line.equalsIgnoreCase("Не сортировать")) {
                        writeProducts(makeProductList(readFile()));
                        allSuccess();
                        break;
                    } else if (line.equalsIgnoreCase("Выход")) {
                        scanner.close();
                        break;
                    } else {
                        System.out.println("Неверная команда, попробуйте еще раз...");
                    }
                }
            } else if (mainCommand.equalsIgnoreCase("Создать список")) {
                System.out.println("Введите номера продуктов из файла 'productList.txt' для добавления (для выхода введите 0)");
                List<Integer> intList = readNumbers();
                scanner.nextLine();
                sortDescription();
                writeDescription();
                //String line = scanner.nextLine();
                while (true) {
                    N = 1;
                    String line = scanner.nextLine();
                    if (line.equalsIgnoreCase("По идентификатору")) {
                        writeProducts(SortByID(makeProductList(makeSpecialSetOfProducts(readFile(), intList))));
                        success();
                        break;
                    } else if (line.equalsIgnoreCase("По названию")) {
                        writeProducts(SortByName(makeProductList(makeSpecialSetOfProducts(readFile(), intList))));
                        success();
                        break;
                    } else if (line.equalsIgnoreCase("По цене")) {
                        writeProducts(SortByPrice(makeProductList(makeSpecialSetOfProducts(readFile(), intList))));
                        success();
                        break;
                    } else if (line.equalsIgnoreCase("По типу")) {
                        writeProducts(SortByType(makeProductList(makeSpecialSetOfProducts(readFile(), intList))));
                        success();
                        break;
                    } else if (line.equalsIgnoreCase("Не сортировать")) {
                        writeProducts(makeProductList(makeSpecialSetOfProducts(readFile(), intList)));
                        success();
                        break;
                    } else if (line.equalsIgnoreCase("Выход")) {
                        scanner.close();
                        break;
                    } else {
                        System.out.println("Неверная команда, попробуйте еще раз...");
                    }
                }
            } else if (mainCommand.equalsIgnoreCase("Добавить продукты")) {
                System.out.println("Введите номера продуктов из файла 'productList.txt' для добавления (для выхода введите 0)");
                List<Integer> intList = readNumbers();
                scanner.nextLine();
                writeProducts(makeProductList(makeSpecialSetOfProducts(readFile(), intList)));
                success();
            } else if (mainCommand.equalsIgnoreCase("Удалить все продукты")) {
                removeAllProducts();
                System.out.println("Все продукты удалены");
            } else if (mainCommand.equalsIgnoreCase("Удалить продукты")) {
                System.out.println("Введите номера продуктов для удаления (для выхода введите 0)");
                removeProducts(readNumbers());
                System.out.println("Выбранные продукты удалены");
                scanner.nextLine();
            } else if (mainCommand.equalsIgnoreCase("ВЫХОД")) {
                scanner.close();
                break;
            } else {
                System.out.println("Неверная команда, попробуйте еще раз...");
            }
        }
    }

    public static void allSuccess() {
        System.out.println("Все продукты добавлены");
    }

    public static void success() {
        System.out.println("Выбранные продукты добавлены");
    }

    public static void sortDescription() {
        System.out.println("Каким способом хотите отсортировать продукты?\n Доступные команды:\n" +
                "- 'По идентификатору'\n- 'По названию'\n- 'По цене'\n- 'По типу'\n- 'Не сортировать' (в порядке добавления)\n");
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
