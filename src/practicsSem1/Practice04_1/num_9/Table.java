package practicsSem1.Practice04_1.num_9;

public class Table extends Furniture {
    private double height;

    public Table(String type, double height, String material, int price) {
        super(material, price, type);
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String tooString() {
        return "Тип стола: " + type + "; Высота стола: " + height + "; Материал стола: " + material + "; Цена стола: " + price;
    }
}
