package practicsSem1.Practice27;

import java.util.HashSet;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(106);
        hashSet.add(1);
        System.out.println("Hashset:");
        for (var n : hashSet) {
            System.out.print(n + " ");
        }

        System.out.println("\nTreeSet:");
        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
        for (var n : treeSet) {
            System.out.print(n + " ");
        }
    }
}
