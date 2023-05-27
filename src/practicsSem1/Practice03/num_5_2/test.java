package Practics.Practice03.num_5_2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение c");
        Double c = Double.valueOf(sc.next());

        Double o = Double.parseDouble("34.56");

        byte q = o.byteValue();
        short w = o.shortValue();
        int e = o.intValue();
        long r = o.longValue();
        float t = o.floatValue();
//boolean u = Boolean.valueOf(Double.toString(c));
//char i = (Double.toString(c)).charAt(1);

//System.out.println(q + " " + w + " " + e + " " + r + " " + t + " "); //+ u + " " + i);

        Double j = Double.valueOf(Double.toString(3.14));
        System.out.println(j);
    }
}
