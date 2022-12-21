package Practice8.num_5;

public class Tester {
    int sumDigits(int num){
        if(num >= 10) return num % 10 + sumDigits(num / 10);
        return num % 10;
    }

    public static void main(String[] args) {
        Tester tester = new Tester();
        int res = tester.sumDigits(222);
        System.out.println(res);
    }
}
