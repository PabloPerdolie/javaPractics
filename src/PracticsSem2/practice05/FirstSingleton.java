package PracticsSem2.practice05;

public class FirstSingleton {
    private static FirstSingleton firstSingleton;

    private FirstSingleton() {
    }

    public static synchronized FirstSingleton getFirstSingleton() {
        if (firstSingleton == null) {
            firstSingleton = new FirstSingleton();
            return firstSingleton;
        }
        return firstSingleton;
    }

    ;
}
