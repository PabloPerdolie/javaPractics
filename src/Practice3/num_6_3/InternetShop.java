package Practice3.num_6_3;

import java.util.Scanner;

public class InternetShop {
    InternetShop()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much money do u have(rubles)?");
        double rubles = sc.nextDouble();
        CurrencyConverter amount = new CurrencyConverter(rubles);
        System.out.println("What currency do u choose for payment?");
        System.out.println("1.USD\n2.EUR\n3.GBP\n4.JPY");
        int menu = sc.nextInt();
        switch (menu)
        {
            case 1:
                System.out.println("You have" + amount.GetUSD() + " dollars");
                break;
            case 2:
                System.out.println("You have" + amount.GetEUR() + " euros");
                break;
            case 3:
                System.out.println("You have" + amount.GetGBP() + " pounds");
                break;
            case 4:
                System.out.println("You have" + amount.GetJPY() + " yens");
                break;
        }
    }
}
