package Practice5.num_1;

public class Button {
    private int Milan = 0;
    private int Real = 0;
    private String last = "N/A";
    public String getReal() { return "Real Madrid" ;}
    public String getMilan() { return "AC Milan"; }
    public int getRealGoals() { return Real; }
    public int getMilanGoals() { return Milan; }
    public void ScoreReal()
    {
        Real++;
        last = getReal();
    }
    public void ScoreMilan()
    {
        Milan++;
        last = getMilan();
    }
    public String getWinner()
    {
        if(Real == Milan) return "DRAW";
        else if(Real > Milan) return getReal();
        else return getMilan();
    }
    public String getLast()
    { return last; }
}
