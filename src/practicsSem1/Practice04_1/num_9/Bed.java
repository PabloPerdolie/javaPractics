package practicsSem1.Practice04_1.num_9;

public class Bed extends Furniture {
    private double area;
    private double height;

    public Bed(double area, double height, String material, int price, String type) {
        super(material, price, type);
        this.area = area;
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String tooString() {
        return "Тип кровати: " + type + "; Площадь кровати: " + area + "; Высота кровати: " + height + "; Материал кровати: " + material + "; Цена кровати: " + price;
    }
}
