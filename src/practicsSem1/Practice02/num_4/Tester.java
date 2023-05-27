package practicsSem1.Practice02.num_4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int menu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number that you want to execute\n1.Add the new computer\n2.Delete the computer\n3.Find the computer\n0.End");
        Shop shop = new Shop();
        do {
            menu = scanner.nextInt();
            String name;
            switch (menu) {
                case 1:
                    System.out.println("Enter the name of computer: ");
                    name = scanner.next();
                    shop.NewComp(name);
                    break;
                case 2:
                    System.out.println("Enter the name of computer: ");
                    name = scanner.next();
                    shop.DeleteComp(name);
                    break;
                case 3:
                    System.out.println("Enter the name of computer: ");
                    name = scanner.next();
                    shop.SearchComp(name);
                    break;
            }
            System.out.println("Enter: ");
        } while (menu != 0);
    }
}
