package Practics.Practice04_1.num_1;

public class Rectangle extends Shape {

    double a; //side of a rectangle
    Rectangle(double a){
        type = "rectangle";
        this.a = a;
    }
    public String getType() { return type; }
    public double getArea() { return (Math.pow(a, 2) * Math.sqrt(3))/4; }
    public double getPerimetr() { return a*3; }

    @Override
    public String toString() {
        return super.toString() + " " + type + ", area = " + getArea() + ", perimetr = " + getPerimetr();
    }
}
