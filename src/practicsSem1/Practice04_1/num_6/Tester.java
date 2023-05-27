package Practics.Practice04_1.num_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество сотрудников: ");
        int size = sc.nextInt();
        ArrayList<Employer> employers = new ArrayList<Employer>(size);
        String fullname;
        int income;
        int averageSum;
        for(int i = 0; i < size; i++)
        {
            System.out.println("Введите кого хотите добавить: \n1.Сотрудник\n2.Менеджер");
            int menu = sc.nextInt();
            switch (menu)
            {
                case 1:
                    System.out.println("Введите имя и заработную плату: ");
                    fullname = sc.next();
                    income = sc.nextInt();
                    employers.add(new Employer(fullname, income));
                    break;
                case 2:
                    System.out.println("Введите имя, заработную плату и сумму с продаж: ");
                    fullname = sc.next();
                    income = sc.nextInt();
                    averageSum = sc.nextInt();
                    employers.add(new Manager(fullname, income, averageSum));
                    break;
            }
        }
        for(int i = 0; i < employers.size(); i++)
        {
            System.out.println(employers.get(i).getFullName() + " " + employers.get(i).getIncome());
        }
    }
}
