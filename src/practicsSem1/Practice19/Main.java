package practicsSem1.Practice19;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Владимир", 77, 12, 18));
        s.add(new Student("Катя", 37, 12, 18));
        s.add(new Student("Паша", 103, 12, 19));
        s.add(new Student("Даниил", 64, 2, 18));
        s.add(new Student("Таня", 66, 12, 18));

        new LabClassUI(s);
    }

}