package practicsSem1.Practice04_1.num_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число учащихся: ");
        int size = sc.nextInt();
        String fullname;
        int grade;
        String direction;
        ArrayList<Pupil> pupils = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            System.out.println("Введите кого хотите добавить: \n1.Школьник\n2.Студент");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Введите имя, класс и направление: ");
                    fullname = sc.next();
                    grade = sc.nextInt();
                    direction = sc.next();

                    pupils.add(new SchoolChild(fullname, grade, direction));
                    break;
                case 2:
                    System.out.println("Введите имя, курс и факультет: ");
                    fullname = sc.next();
                    grade = sc.nextInt();
                    direction = sc.next();
                    pupils.add(new Student(fullname, grade, direction));
                    break;
            }
        }
        for (int i = 0; i < size; i++)
            System.out.println(pupils.get(i).toString());
    }
}
