package Practics.Practice04_1.num_1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double R = sc.nextDouble();
        System.out.println("Enter the side of rectangle: ");
        double a = sc.nextDouble();
        System.out.println("Enter the side of square: ");
        double a1 = sc.nextDouble();
        Circle circle = new Circle(R);
        Rectangle rectangle =  new Rectangle(a);
        Square square = new Square(a1);
        System.out.println(circle.toString() + "\n" + rectangle.toString() + "\n" + square.toString());
    }
}
