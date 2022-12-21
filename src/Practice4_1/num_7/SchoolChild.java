package Practice4_1.num_7;

class SchoolChild extends Pupil
{
    private String direction;

    public SchoolChild(String fullname, int grade, String direction)
    {
        super(fullname, grade);
        this.direction = direction;
    }

    public String toString()
    {
        return super.toString() + " класс, " + direction;
    }
}
