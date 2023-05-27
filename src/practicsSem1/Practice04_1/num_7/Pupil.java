package Practics.Practice04_1.num_7;

public class Pupil {
    private String fullName;
    private int grade;

    public Pupil(){}

    public Pupil(String fullName, int grade)
    {
        this.fullName = fullName;
        this.grade = grade;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getFullName() {
        return fullName;
    }
    public int getGrade() {
        return grade;
    }

    public String toString()
    {
        return fullName + " " + grade;
    }
}
