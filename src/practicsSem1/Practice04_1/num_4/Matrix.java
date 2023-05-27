package practicsSem1.Practice04_1.num_4;

import java.util.Scanner;

public class Matrix {
    double[][] mas;
    int columns;
    int strings;

    public Matrix(int columns, int strings) {
        this.columns = columns;
        this.strings = strings;
        mas = new double[strings][columns];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < strings; i++) {
            for (int j = 0; j < columns; j++) {
                mas[i][j] = sc.nextDouble();
            }
        }
    }

    public void Addition(Matrix mas1) {
        for (int i = 0; i < strings; i++)
            for (int j = 0; j < columns; j++)
                mas[i][j] += mas1.mas[i][j];
    }

    public void Multiplication(int num) {
        for (int i = 0; i < strings; i++)
            for (int j = 0; j < columns; j++)
                mas[i][j] *= num;
    }

    public void Print() {
        for (int i = 0; i < strings; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%s ", mas[i][j]);
            }
            System.out.println("\n");
        }
    }

}
