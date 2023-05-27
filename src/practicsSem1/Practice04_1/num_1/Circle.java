package Practics.Practice04_1.num_1;

public class Circle extends Shape {
    double R;
    Circle(double R) {
        this.R = R;
        type = "circle";
    }
    public String getType() { return type; }
    public double getArea() { return Math.pow(R, 2) * Math.PI; }
    public double getPerimetr() { return 2 * R * Math.PI; }
    @Override
    public String toString() {
        return super.toString() + " " + type + ", area = " + getArea() + ", perimetr = " + getPerimetr();
    }
}
