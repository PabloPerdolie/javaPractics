package Practice2.num_9;

public class card {
    String suit;
    String num;
    public String Num(int i)
    {
        if((i % 13 <= 8)) return "" + (i % 13 + 2);
        else if (i % 13 == 9) return "J";
        else if (i % 13 == 10) return "Q";
        else if (i % 13 == 11) return "K";
        else return "A";

    }
}
