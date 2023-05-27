package Practics.Practice07.num_4;

public class MathFunc implements MathCalculable{
    @Override
    public double pow(double a, double b) {
        for(int i = 0; i < b; i++)
            a *= a;
        return a;
    }

    @Override
    public double PI() {
        return 3.141592654;
    }

    @Override
    public double module(double real, double image) {
        return Math.sqrt(real*real + image*image);
    }
}
