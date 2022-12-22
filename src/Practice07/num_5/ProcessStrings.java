package Practice07.num_5;

public class ProcessStrings implements StringWorkable{
    @Override
    public int charCounter(String s) {
        return s.length();
    }

    public String unEven(String s)
    {
        String s1 = "";
        for(int i = 1; i < s.length(); i+=2)
            s1 += s.charAt(i);
        return s1;
    }

    @Override
    public String StrInverter(String s) {

        String b = "";

        for(int i = s.length() - 1; i >= 0; i--)
        {
            b += s.charAt(i);
        }
        return b;
    }
}
