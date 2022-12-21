package Practice4_1.num_1;

public class Square extends Shape{

    double a;
    Square(double a) {
        this.a = a;
        type = "square";
    }
    public String getType() { return type; }
    public double getArea() { return Math.pow(a, 2); }
    public double getPerimetr() { return a*4; }
    @Override
    public String toString() {
        return super.toString() + " " + type + ", area = " + getArea() + ", perimetr = " + getPerimetr();
    }
}
