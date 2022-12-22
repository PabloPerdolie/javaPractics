package Practice02.num_6;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        double R, x, y, R1, x1, y1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("X, Y, R for Circle №1");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        R = scanner.nextDouble();
        System.out.println("X, Y, R for Circle №2");
        Circle circle1 = new Circle(x, y, R);
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        R1 = scanner.nextDouble();
        Circle circle2 = new Circle(x1, y1, R1);
        if(circle1.getR() > circle2.getR()) System.out.println("First circle is bigger");
        else System.out.println("Second circle is bigger");
        System.out.println("Circle №1: S = " + circle1.getSquare() + ", P = " + circle1.getLength());
        System.out.println("Circle №2: S = " + circle2.getSquare() + ", P = " + circle2.getLength());
    }
}
