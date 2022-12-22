package Practice01;

public class task7 {
    public static int faktorial (int a){
        int fakt = a;
        int i = 1;
        while ((a - i) > 0) {
            fakt = fakt * (a - i);
            i++;
        }
        return fakt;
    }
    public static void main(String[] args) {
        int f = faktorial(3);
        System.out.println(f);
    }
}
