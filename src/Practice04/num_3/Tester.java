package Practice04.num_3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the login and password.\nLogin: ");
        String login = sc.next();
        System.out.println("Password: ");
        String password = sc.next();
        int sum = 0;
        int menu = -1;
        do {
            System.out.println("Список каталога товаров: ");
            int i = 1;
            for(InternetShop shop : InternetShop.values()) {
                System.out.println(i + "." + shop.toString());
                i++;
            }
            System.out.println("ENTER: ");
            menu = sc.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Список товаров: ");
                    i = 1;
                    for(InternetShop.outerwear shop : InternetShop.outerwear.values()) {
                        System.out.println(i + "." + shop.toString());
                        i++;
                    }
                    menu = sc.nextInt();
                    switch (menu)
                    {
                        case 1:
                            sum += InternetShop.outerwear.JACKETS.price;
                            break;
                        case 2:
                            sum += InternetShop.outerwear.RAINCOATS.price;
                            break;
                        case 3:
                            sum += InternetShop.outerwear.DOWNJACKETS.price;
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Список товаров: ");
                    i = 1;
                    for(InternetShop.pants shop : InternetShop.pants.values()) {
                        System.out.println(i + "." + shop.toString());
                        i++;
                    }
                    menu = sc.nextInt();
                    switch (menu)
                    {
                        case 1:
                            sum += InternetShop.pants.JEANS.price;
                            break;
                        case 2:
                            sum += InternetShop.pants.SKINNY.price;
                            break;
                        case 3:
                            sum += InternetShop.pants.WIDE.price;
                            break;
                    }

                    break;
                case 3:
                    System.out.println("Список товаров: ");
                    i = 1;
                    for(InternetShop.underclothes shop : InternetShop.underclothes.values()) {
                        System.out.println(i + "." + shop.toString());
                        i++;
                    }
                    menu = sc.nextInt();
                    switch (menu)
                    {
                        case 1:
                            sum += InternetShop.underclothes.UNDERPANTS.price;
                            break;
                        case 2:
                            sum += InternetShop.underclothes.BRASSIERE.price;
                            break;
                    }
                    break;
            }
        } while (menu != 0);
        System.out.println("Total cost: " + sum);

    }
}
