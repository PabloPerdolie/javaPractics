package practicsSem1.Practice04_1.num_6;

public class Employer {
    protected String fullName;
    private int income;

    public Employer() {
    }

    public Employer(String fullName, int income) {
        this.fullName = fullName;
        this.income = income;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


}
