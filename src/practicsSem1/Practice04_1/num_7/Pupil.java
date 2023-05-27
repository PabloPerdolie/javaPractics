package practicsSem1.Practice04_1.num_7;

public class Pupil {
    private String fullName;
    private int grade;

    public Pupil() {
    }

    public Pupil(String fullName, int grade) {
        this.fullName = fullName;
        this.grade = grade;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String toString() {
        return fullName + " " + grade;
    }
}
