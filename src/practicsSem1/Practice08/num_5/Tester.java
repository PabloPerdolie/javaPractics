package practicsSem1.Practice08.num_5;

public class Tester {
    public static void main(String[] args) {
        Tester tester = new Tester();
        int res = tester.sumDigits(222);
        System.out.println(res);
    }

    int sumDigits(int num) {
        if (num >= 10) return num % 10 + sumDigits(num / 10);
        return num % 10;
    }
}
