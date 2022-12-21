package Practice26;

import java.util.HashMap;
import java.util.Map;

public class HashTab<T, V> {
    public static void main(String[] args) {

        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(212133, "Petr Pupkin Alekseevich");
        passportsAndNames.put(162348, "Vladislave Ivanov Petrovich");
        passportsAndNames.put(8082771, "Margarita Vasilieva Pavlovna");

        String Name = passportsAndNames.get(212133);
        System.out.println(Name);

        passportsAndNames.remove(162348);
        System.out.println(passportsAndNames);

    }
}
