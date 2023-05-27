package practicsSem1.Practice08.num_3;

public class Tester {
    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.fun(10, 20);
    }

    void fun(int a, int b) {
        System.out.println(a);
        ;
        if (a == b) return;
        if (b > a) fun(a + 1, b);
        else fun(a - 1, b);
    }
}
