package practicsSem1.Practice03.num_6_3;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeReport {
    static int current = 0;
    public Report report = new Report();
    ArrayList<Employee> employees = new ArrayList<>(10);
    Scanner sc = new Scanner(System.in);

    public void addEmployee() {
        if (current == 10) {
            System.out.println("Exceeded the employee limit!");
            return;
        }
        System.out.println("Full name: ");
        String fullname = sc.next();
        System.out.println("Salary: ");
        double salary = sc.nextDouble();
        employees.add(new Employee(fullname, salary));
        current++;
    }

    private class Employee {
        String fullname;
        double salary;

        Employee(String fullname, double salary) {
            this.fullname = fullname;
            this.salary = salary;
        }
    }

    public class Report {
        public void generateReport() {
            System.out.printf("%-20s %15s %n", "Full name", "Salary");
            for (int i = 0; i < current; i++) {
                System.out.printf("%-20s %15.2f %n", employees.get(i).fullname, employees.get(i).salary);
            }
        }
    }
}
