package Practics.Practice03.num_6_3;

import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 1;
        do {

            System.out.println("Enter the number u want to complete: \n1.Internet Shop\n2.Employees Report\n0.Exit");
            menu = sc.nextInt();
            switch (menu)
            {
                case 1:
                    InternetShop shop = new InternetShop();
                    break;
                case 2:
                    EmployeeReport report = new EmployeeReport();
                    int menu1 = 1;
                    do {
                        System.out.println("1.Add new Employee\n2.Look at the Report of the Epmployees");
                        menu1 = sc.nextInt();
                        switch (menu1)
                        {
                            case 1:
                                report.addEmployee();
                                break;
                            case 2:
                                report.report.generateReport();
                                break;

                        }
                    } while(menu1 != 0);

            }
        } while(menu != 0);
    }
}
