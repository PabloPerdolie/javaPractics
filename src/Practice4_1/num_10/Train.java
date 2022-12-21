package Practice4_1.num_10;

class Train extends Vehicle
{
    public Train(int time, int price)
    {
        super(time, price);
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public String tooString()
    {
        return "Стоимость перезда: " + price * time;
    }
}
