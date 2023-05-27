package practicsSem1.Practice04.num_1;

public enum Seasons {
    AUTUMN(8.3),
    SUMMER(18.5),
    WINTER(-9.6),
    SPRING(8.5);

    public final String bestSeason = "SUMMER";
    private double average_temp;

    Seasons(double average_temp) {
        this.average_temp = average_temp;
    }

    public static void main(String[] args) {
        for (Seasons season : Seasons.values()) {
            System.out.println(season + " " + season.average_temp + "\n" + season.getDescription(season));
        }
    }

    public Seasons getSeason() {
        return this;
    }

    public void Love(Seasons season) {
        switch (season) {
            case AUTUMN:
                System.out.println("I love autumn!");
                break;
            case SPRING:
                System.out.println("I love spring!");
                break;
            case SUMMER:
                System.out.println("I love summer!");
                break;
            case WINTER:
                System.out.println("I love winter!");
                break;
        }
    }

    public String getDescription() {
        return "Cold season.";
    }

    public String getDescription(Seasons season) {
        if (season == SUMMER) return "Warm season.";
        return "Cold season.";
    }
}
