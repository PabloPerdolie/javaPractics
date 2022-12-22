package Practice04_1.num_7;

class Student extends Pupil
{
    private String faculty;

    public Student(String fullname, int grade, String faculty)
    {
        super(fullname, grade);
        this.faculty = faculty;
    }

    public String toString()
    {
        return super.toString() + " курс, " + faculty;
    }
}
