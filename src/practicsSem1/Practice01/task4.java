package Practics.Practice01;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int[] b = new int[10];
        System.out.println("Введите 10 элементов массива");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        int max = b[0];
        int min = b[0];
        int i = 0;
        while (i < b.length) {
            sum = sum + b[i];
            if (b[i] < min) {
                min = b[i];
            }
            if (b[i] > max) {
                max = b[i];
            }
            i++;
        }

        System.out.println("Сумма чисел массива: ");
        System.out.println(sum);
        System.out.println("максимальное значение массива: ");
        System.out.println(max);
        System.out.println("минимальное значение массива: ");
        System.out.println(min);
    }
}
