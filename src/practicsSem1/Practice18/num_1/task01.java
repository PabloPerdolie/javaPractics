package practicsSem1.Practice18.num_1;

public class task01 {
    public static void exceptionDemo1() {
        System.out.println(2 / 0);
    }

    public static void exceptionDemo2() {
        System.out.println(2.0 / 0.0);
    }

    public static void exceptionDemo3() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }

    }

    public static void main(String[] args) {
        exceptionDemo2();
        exceptionDemo3();
    }
}
