package Practics.Practice04_1.num_10;

abstract class Vehicle
{
    protected int time;
    protected int price;

    public Vehicle(int time, int price)
    {
        this.price = price;
        this.time = time;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setTime(int time) {
        this.time = time;
    }

    public int getPrice() {
        return price;
    }
    public int getTime() {
        return time;
    }

    public String tooString()
    {
        return null;
    }
}
