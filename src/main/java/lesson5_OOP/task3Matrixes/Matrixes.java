package lesson5_OOP.task3Matrixes;

public class Matrixes {

    public static void main(String[] args) {
        Matrix matrixes = new Matrix();
        Matrix first = matrixes.read();
        Matrix second = matrixes.read();
        Matrix product = matrixes.product(first, second);
        if (product == null) {
            System.out.println("Эти матрицы не могут быть умножены");
        } else {
            matrixes.print(product);
        }
    }
}













// ---------------------------------------
   /* Matrix read() {
        System.out.print("Введите размерность массива, сначала строки, потом столбцы: \n");
        int row = in.nextInt();
        int column = in.nextInt();
        Matrix mass = new Matrix(row, column);
        System.out.print("Введите элементы этого массива в виде матрицы, переходя на следующую строку нажатием Enter: \n");
        for (int i = 0; i < mass.rows(); i++) {
            for (int j = 0; j < mass.columns(); j++) {
                int temp = in.nextInt();
                mass.update(i, j, temp);
            }
        }
        return mass;
    }

    // ---------------------------------------
    void print(Matrix matrix) {
        for (int i = 0; i < matrix.rows(); ++i) {
            for (int j = 0; j < matrix.columns(); ++j) {
                System.out.print(matrix.element(i, j)+"  ");
            }
            System.out.println();
        }
    }

    // ---------------------------------------
    Matrix product(Matrix first, Matrix second) {
        int row1 = first.rows(), col1 = first.columns(), row2 = second.rows(), col2 = second.columns();
        Matrix res = new Matrix(first.rows(), second.columns());
        if (col1 == row2) {
            for (int i = 0; i < row1; i++) {
                for (int k = 0; k < col2; k++) {
                    for (int j = 0; j < row2; j++) {
                        res.update(i, k, res.element(i, k) + first.element(i, j) * second.element(j, k));
                    }
                }
            }
            System.out.println("Перемножаем.......");
            return res;
        } else
            return null;
    }
}*/
