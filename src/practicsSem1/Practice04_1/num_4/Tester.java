package practicsSem1.Practice04_1.num_4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("First: ");
        Matrix matrix = new Matrix(2, 2);
        System.out.println("Second: ");
        Matrix matrix1 = new Matrix(2, 2);
        System.out.println("Enter the num that u want to multiplying on matrix: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        matrix.Multiplication(num);
        matrix.Print();
        matrix.Addition(matrix1);
        matrix.Print();

    }
}
