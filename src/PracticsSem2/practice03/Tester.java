package PracticsSem2.practice03;

import java.util.Iterator;

public class Tester {
    public static void main(String[] args) throws InterruptedException {
        Set set = new Set();
        Thread one = new Thread(() ->
        {
            set.add(128);
            set.add(36);
            set.add(475);
        });
        Thread two = new Thread(() ->
        {
            set.add(247);
            set.add(294);
            set.add(798);
        });

        Thread three = new Thread(() ->
        {
            set.remove(1);
        });
        Thread four = new Thread(() ->
        {
            set.remove(4);
        });
        one.start();
        two.start();
        three.start();
        four.start();
        Thread.sleep(1000);

        System.out.println(set.ToString());


        MapLock myMap = new MapLock();
        myMap.addEntry(new Map(123, "123"));
        myMap.addEntry(new Map(100, "131"));

        Thread one1 = new Thread(()->
        {
            myMap.addEntry(new Map(113, "123"));
            myMap.addEntry(new Map(102, "131"));
            myMap.addEntry(new Map(105, "154"));
        });
        Thread two2 = new Thread(()->
        {
            myMap.addEntry(new Map(333, "657"));
        });
        two2.start();
        one1.start();
        Thread.sleep(1000);

        myMap.ToString();
    }
}