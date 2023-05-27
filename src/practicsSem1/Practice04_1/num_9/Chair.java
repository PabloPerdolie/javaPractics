package practicsSem1.Practice04_1.num_9;

public class Chair extends Furniture {
    public Chair(String type, String material, int price) {
        super(material, price, type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String tooString() {
        return "Тип стула: " + type + "; Материал стула: " + material + "; Цена стула: " + price;
    }
}
