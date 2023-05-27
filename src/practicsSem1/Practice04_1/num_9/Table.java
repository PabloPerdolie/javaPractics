package Practics.Practice04_1.num_9;

public class Table extends Furniture{
    private double height;

    public Table (String type, double height, String material, int price)
    {
        super(material, price, type);
        this.height = height;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }
    public double getHeight() {
        return height;
    }

    @Override
    public String tooString()
    {
        return "Тип стола: " + type + "; Высота стола: " + height + "; Материал стола: " + material + "; Цена стола: " + price;
    }
}
