package practicsSem1.Practice03.num_6_3;

public class CurrencyConverter {
    double rubles;

    CurrencyConverter(double rubles) {
        this.rubles = rubles;
    }

    public double GetUSD() {
        return rubles / 60.87;
    }

    public double GetEUR() {
        return rubles / 60.21;
    }

    public double GetGBP() {
        return rubles / 69.48;
    }

    public double GetJPY() {
        return rubles / 0.4236;
    }


}
