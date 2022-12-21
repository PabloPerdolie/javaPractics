package Practice6.num_6_9;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Printable> mas = new ArrayList<>(5);
        mas.add(0, new Book("vfjvnfjv", "jvnfjvnfj"));
        mas.add(1, new Magazine("vfjvnfjv", "jvnfjvnfj"));
        mas.add(2, new Book("vfjvnfjv", "jvnfjvnfj"));
        mas.add(3, new Magazine("vfjvnfjv", "jvnfjvnfj"));
        mas.add(4, new Book("vfjvnfjv", "jvnfjvnfj"));
        for(int i = 0; i < mas.size(); i++)
        {
            mas.get(i).print();
        }

    }
}
