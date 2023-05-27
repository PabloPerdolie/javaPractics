package practicsSem1.Practice04_1.num_9;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Furniture> furnitures = new ArrayList<>();
        int menu = -1;
        double area;
        double height;
        String material;
        int price;
        do {


            System.out.println("Enter what u want to buy: \n1.Bed\n2.Chair\n3.Table");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Enter the area, height, material, price");
                    area = sc.nextDouble();
                    height = sc.nextDouble();
                    material = sc.next();
                    price = sc.nextInt();
                    furnitures.add(new Bed(area, height, material, price, "bed"));
                    break;
                case 2:
                    System.out.println("Enter the material, price");
                    material = sc.next();
                    price = sc.nextInt();
                    furnitures.add(new Chair("chair", material, price));
                    break;
                case 3:
                    System.out.println("Enter the height, material, price");
                    height = sc.nextDouble();
                    material = sc.next();
                    price = sc.nextInt();
                    furnitures.add(new Table("bed", height, material, price));
                    break;
            }
        } while (menu != 0);
        int res = 0;
        for (int i = 0; i < furnitures.size(); i++) {
            res += furnitures.get(i).getPrice();
        }
        System.out.println("Total cost: " + res);
    }
}
