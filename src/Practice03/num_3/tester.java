package Practice03.num_3;

import java.util.ArrayList;
import java.util.Random;

public class tester {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> mas = new ArrayList<>(4);
        for(int i = 0; i < 4; i++)
            mas.add(rand.nextInt(10, 99));
        System.out.println(mas.toString());
        boolean flag = true;
        for(int i = 0; i < 4; i++)
            if(mas.get(i) >= mas.get(i + 1))
            {
                flag = false;
                break;
            } else continue;
        if(flag) System.out.println("Строго возрастающая последовательность");
        else System.out.println("Последовательность общего типа");
    }
}
