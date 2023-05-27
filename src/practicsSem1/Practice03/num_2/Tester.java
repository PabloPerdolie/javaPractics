package practicsSem1.Practice03.num_2;

import practicsSem1.Practice02.num_3.Circle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Tester {

    static int length;
    static ArrayList<Circle> mas = new ArrayList<>(length);

    public static Circle Big() {
        Circle mx = new Circle(0, 0, 0);
        for (int i = 0; i < length; i++)
            if (mas.get(i).getR() > mx.getR())
                mx = mas.get(i);
        return mx;
    }

    public static Circle Small() {
        Circle mn = new Circle(10000, 0, 0);
        for (int i = 0; i < length; i++)
            if (mn.getR() > mas.get(i).getR())
                mn = mas.get(i);
        return mn;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of circles: ");
        length = scanner.nextInt();
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            double R = rand.nextDouble(100);
            double x = rand.nextDouble(10);
            double y = rand.nextDouble(10);
            mas.add(new Circle(R, x, y));
        }

        radiusComparator comparator = new radiusComparator();
        Collections.sort(mas, comparator);

        System.out.println(Big().getR() + "\n" + Small().getR());

        for (int i = 0; i < length; i++) {
            System.out.println("x = " + mas.get(i).getX() + ", y = " + mas.get(i).getY() + ", R = " + mas.get(i).getR());
        }

    }
}
