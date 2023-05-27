package Practics.Practice03.num_4;

import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter a positive number: ");
            try {
                n = Integer.parseInt(sc.next());
                if(n < 1) continue;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect!");
            }
        }
        Random rand = new Random();
        int[] mas = new int[n];
        int n1 = 0;
        for(int i = 0; i < n; i++)
        {
            mas[i] = rand.nextInt(100);
            if(mas[i] % 2 == 0) n1++;
        }
        int[] mas1 = new int[n1];
        System.out.println("First array: ");
        for(int i = 0; i < n; i++)
            System.out.println(mas[i]);
        int j = 0;
        for(int i = 0; i < n; i++)
        {
            if(mas[i] % 2 == 0)
            {
                mas1[j] = mas[i];
                j++;
            }
        }
        System.out.println("Second array: ");
        for(int i = 0; i < mas1.length; i++)
            System.out.println(mas1[i]);

    }
}
