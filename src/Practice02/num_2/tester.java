package Practice02.num_2;
import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        double x, y, xDisp, yDisp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальные координаты мяча: ");
        x = scanner.nextInt();
        y = scanner.nextInt();
        ball Ball = new ball(x, y);
        System.out.println("Введите перемещание мяча: ");
        xDisp = scanner.nextInt();
        yDisp = scanner.nextInt();
        Ball.move(xDisp, yDisp);
        System.out.println("x = " + Ball.getX() + ",y = " + Ball.getY());
    }
}
