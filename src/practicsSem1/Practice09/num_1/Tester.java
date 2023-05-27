package practicsSem1.Practice09.num_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(5);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            students.add(i, new Student(name));
        }
        for (int left = 0; left < students.size(); left++) {
            Student value = students.get(left);
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.name.compareTo(students.get(i).name) < 0) {
                    students.set(i + 1, students.get(i));
                } else {
                    break;
                }
            }
            students.set(i + 1, value);
        }
        for (int i = 0; i < students.size(); i++)
            System.out.println(students.get(i).name);
    }
}
