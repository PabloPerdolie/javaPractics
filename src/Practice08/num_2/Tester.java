package Practice08.num_2;

public class Tester {
    void fun(int num)
    {
        if(num != 1) fun(num - 1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.fun(10);
    }
}
