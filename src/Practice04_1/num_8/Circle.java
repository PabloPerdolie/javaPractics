package Practice04_1.num_8;

public class Circle extends Shape {
    protected double radius;
    Circle(){}

    Circle(double radius) { this.radius = radius;}

    Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {return radius * radius * Math.PI;}

    @Override
    double getPerimetr() {return 2 * radius * Math.PI;}

    public String toString() {return "Радиус: " + radius + "; Цвет: " + color + ";";}
}

