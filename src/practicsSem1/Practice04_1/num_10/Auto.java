package practicsSem1.Practice04_1.num_10;

class Auto extends Vehicle {
    private double BenzinePrice;

    public Auto(int time, int BenzinePrice) {
        super(time, 0);
        this.BenzinePrice = BenzinePrice;
    }

    public double getBenzinePrice() {
        return BenzinePrice;
    }

    public void setBenzinePrice(double benzinePrice) {
        BenzinePrice = benzinePrice;
    }

    @Override
    public String tooString() {
        return "Стоимость перезда: " + BenzinePrice * time;
    }
}
