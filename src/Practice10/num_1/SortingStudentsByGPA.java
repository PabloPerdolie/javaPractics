package Practice10.num_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SortingStudentsByGPA implements Comparator<Student> {

    ArrayList<Student> students = new ArrayList<>(5);
    @Override
    public int compare(Student stud1, Student stud2) {
        return stud1.GPA <= stud2.GPA ? 1 : 0;
    }

    void outArray(ArrayList<Student> students)
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Student " + (i + 1) + ": " + students.get(i).name + " " + students.get(i).GPA);
        }
    }

    void setArrayMerge(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter the name of the student and him GPA: ");
            String cur_name = sc.next();
            int cur_GPA = sc.nextInt();
            students.add(new Student(cur_name, cur_GPA));
        }
        mergeSort(students, 5);
        outArray(students);
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

    void setArrayQuick(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter the name of the student and him GPA: ");
            String cur_name = sc.next();
            int cur_GPA = sc.nextInt();
            students.add(new Student(cur_name, cur_GPA));
        }
        students = quickSort(students, 0, 4);
        outArray(students);
    }

    public ArrayList<Student> quickSort(ArrayList<Student> students, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(students, begin, end);

            quickSort(students, begin, partitionIndex-1);
            quickSort(students, partitionIndex+1, end);
        }
        return students;
    }
    private int partition(ArrayList<Student> students, int begin, int end) {
        Student pivot = students.get(end);
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (compare(students.get(j), pivot) == 0) {
                i++;

                Student swapTemp = students.get(i);
                students.set(i, students.get(j)) ;
                students.set(j, swapTemp);
            }
        }

        Student swapTemp = students.get(i+1);
        students.set(i+1, students.get(end));
        students.set(end, swapTemp);

        return i+1;
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        sort.setArrayQuick();
    }
}
