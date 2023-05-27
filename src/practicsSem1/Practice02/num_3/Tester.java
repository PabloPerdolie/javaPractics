package practicsSem1.Practice02.num_3;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        int length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of circles: ");
        length = scanner.nextInt();
        Circle[] mas = new Circle[length];
        for (int i = 0; i < length; i++) {

            System.out.println("Enter the radius: ");
            double R = scanner.nextDouble();
            System.out.println("Enter the X coordinate of the center: ");
            double x = scanner.nextDouble();
            System.out.println("Enter the Y coordinate of the center: ");
            double y = scanner.nextDouble();
            mas[i] = new Circle(R, x, y);
        }
        for (int i = 0; i < length; i++) {
            System.out.println("x = " + mas[i].getX() + ", y = " + mas[i].getY() + ", R = " + mas[i].getR());
        }

    }
}
