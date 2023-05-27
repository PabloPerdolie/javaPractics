package practicsSem1.Practice04_1.num_10;

class Plane extends Vehicle {
    public Plane(int time, int price) {
        super(time, price);
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String tooString() {
        return "Стоимость перелета: " + time * price;
    }
}
