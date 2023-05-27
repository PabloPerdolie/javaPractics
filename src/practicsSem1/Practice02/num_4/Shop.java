package practicsSem1.Practice02.num_4;

import java.util.Objects;

public class Shop {
    static int length = 10;
    String[] mas = new String[length];
    int current = 0;

    public void NewComp(String name) {
        if (current == length - 1) {
            System.out.println("No place for new computer");
            return;
        }

        mas[current] = name;
        current++;
    }

    public void DeleteComp(String name) {
        for (int i = 0; i < current; i++) {
            if (Objects.equals(mas[i], name)) {
                mas[i] = "";
                for (int j = i; j < current; j++) mas[j] = mas[j + 1];
                System.out.println("Computer's was deleted");
                current--;
                return;
            }
        }
        System.out.println("Computer with this name was not found");
    }

    public void SearchComp(String name) {
        for (int i = 0; i < current; i++) {
            if (Objects.equals(mas[i], name)) {
                System.out.println("Computer was founded and his number is " + (i + 1));
                return;
            }
        }
        System.out.println("Computer with this name was not found");
    }

    public void Print() {
        for (int i = 0; i < current; i++) {
            System.out.println(mas[i]);
        }
    }
}
