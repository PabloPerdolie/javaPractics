package Practice09.num_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SortingStudentsByGPA implements Comparator<Student> {

    ArrayList<Student> students = new ArrayList<>(5);
    @Override
    public int compare(Student stud1, Student stud2) {
        return stud1.GPA <= stud2.GPA ? 1 : 0;
    }
    SortingStudentsByGPA(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter the name of the student and him GPA: ");
            String cur_name = sc.next();
            int cur_GPA = sc.nextInt();
            students.add(new Student(cur_name, cur_GPA));
        }
        students = quickSort(students, 0, 4);
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Student " + (i + 1) + ": " + students.get(i).name + " " + students.get(i).GPA);
        }
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
    }
}
