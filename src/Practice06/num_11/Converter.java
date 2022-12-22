package Practice06.num_11;

public class Converter implements Convertable{
    private int temp;

    Converter(int temp)
    {
        this.temp = temp;
    }

    @Override
    public int convertKalvin() {
        return temp + 273;
    }

    @Override
    public int convertFarengeith() {
        return temp*9/5 + 32;
    }
}
