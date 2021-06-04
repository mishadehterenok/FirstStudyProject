package lesson3_Arrays;
import java.util.Scanner;

public class X_O {
    public static void main(String[] args) {
        char[] field = {'_', '_', '_', '_', '_', '_', '_', '_', '_'};

        for (int i = 1; i < field.length + 1; i++) {
            System.out.print(field[i - 1] + " ");

            if (i % 3 == 0) {
                System.out.println();
            }

        }

        Scanner scanner = new Scanner(System.in);

        boolean gameOver = false;
        int count = 0;
        char x;

        while (!gameOver) {

            if (count % 2 == 0) {
                x = 'x';
            } else {
                x = 'o';
            }

            while (true) {
                System.out.print("Ходит " + x + ", введите координаты ячейки: ");
                int zeroX = scanner.nextInt();
                int zeroY = scanner.nextInt();

                if (zeroX >= 0 && zeroX <= 2 && zeroY >= 0 && zeroY <= 2 && field[(zeroX * 3) + zeroY] == '_') {
                    field[(zeroX * 3) + zeroY] = x;

                    for (int i = 1; i < field.length + 1; i++) {
                        System.out.print(field[i - 1] + " ");

                        if (i % 3 == 0) {
                            System.out.println();
                        }
                    }
                    count++;
                    break;
                }
            }


            if (count > 4) {
                for (int i = 0; i < 3; i++) {

                    int check1=field[3*i] + field[3*i + 1] + field[3*i + 2];
                    int check2=field[i] + field[i + 3] + field[i + 6];
                    int check3=field[0] + field[4] + field[8];
                    int check4=field[2] + field[4] + field[6];


                    if ( check1== 360 ||check2==360 || check3==360 || check4 == 360) {
                        System.out.println("Победил х");
                        gameOver = true;
                        break;
                    } else if (check1== 333 ||check2==333 || check3==333 || check4 == 333) {
                        System.out.println("Победил o");
                        gameOver = true;
                        break;
                    } else if (count==9){
                        System.out.println("Ничья");
                        gameOver = true;
                        break;
                    }

                }
            }
        }

    }
}
