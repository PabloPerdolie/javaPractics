package Practice04_1.num_9;

abstract class Furniture
{
    protected String material;
    protected int price;
    protected String type;

    public Furniture(){}
    public Furniture(String material, int price, String type)
    {
        this.material = material;
        this.price = price;
        this.type = type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public String getMaterial() {
        return material;
    }

    public String tooString(){ return null; }
}
