package Practics.Practice02.num_10;

import java.util.Objects;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        int count = 1;
        for(int i = 0; i < words.length(); i++)
        {
            char c = words.charAt(i);
            if(Objects.equals(c, ' '))
                count++;
        }
        System.out.println(count);
    }
}
