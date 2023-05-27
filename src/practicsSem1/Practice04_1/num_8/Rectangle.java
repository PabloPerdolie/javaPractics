package practicsSem1.Practice04_1.num_8;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle() {
    }

    Rectangle(double width, double length) {
        super();
        this.length = length;
        this.width = width;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimetr() {
        return width * 2 + length * 2;
    }

    @Override
    public String toString() {
        return "Высота: " + length + "; Ширина: " + width + "; Цвет: " + color;
    }
}
