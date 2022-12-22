package Practice09.num_3;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeTwoMassive {

    MergeTwoMassive(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students1 = new ArrayList<>(3);
        ArrayList<Student> students2 = new ArrayList<>(3);
        System.out.println("Enter the students of the first part: ");
        for(int i = 0; i < 3; i++) {
            System.out.println("Enter the name of the student and him GPA: ");
            String cur_name = sc.next();
            int cur_GPA = sc.nextInt();
            students1.add(new Student(cur_name, cur_GPA));
        }
        System.out.println("Enter the students of the second part: ");
        for(int i = 0; i < 3; i++) {
            System.out.println("Enter the name of the student and him GPA: ");
            String cur_name = sc.next();
            int cur_GPA = sc.nextInt();
            students2.add(new Student(cur_name, cur_GPA));
        }
        ArrayList<Student> students= new ArrayList<>(6);
        int j = 0;
        for (int i = 0; i < 6; i+=2)
        {
            students.add(i, students1.get(j));
            students.add(i + 1, students2.get(j));
            j++;
        }
        students = mergeSort(students, 6);
        for(int i = 0; i < 6; i++)
        {
            System.out.println("Student " + (i + 1) + ": " + students.get(i).name + " " + students.get(i).GPA);
        }
    }

    public ArrayList<Student> mergeSort(ArrayList<Student> a, int n) {
        if (n < 2) {
            return a;
        }
        int mid = n / 2;
        ArrayList<Student> l = new ArrayList<>(mid);
        ArrayList<Student> r = new ArrayList<>(n - mid);

        for (int i = 0; i < mid; i++) {
            l.add(i, a.get(i));
        }
        for (int i = mid; i < n; i++) {
            r.add(i - mid, a.get(i));
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
        return a;
    }
    public static void merge(ArrayList<Student> a, ArrayList<Student> l, ArrayList<Student> r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l.get(i).GPA <= r.get(j).GPA) {
                a.set(k++, l.get(i++));
            }
            else {
                a.set(k++, r.get(j++));
            }
        }
        while (i < left) {
            a.set(k++, l.get(i++));
        }
        while (j < right) {
            a.set(k++, r.get(j++));
        }
    }

    public static void main(String[] args) {
        MergeTwoMassive mergeTwoMassive = new MergeTwoMassive();
    }
}
