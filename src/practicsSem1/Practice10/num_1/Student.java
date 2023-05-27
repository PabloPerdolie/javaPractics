package Practics.Practice10.num_1;

public class Student {
    String name;
    int GPA;

    public Student(String name, int GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public int getGPA() {
        return GPA;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }
}
