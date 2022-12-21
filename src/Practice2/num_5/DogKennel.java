package Practice2.num_5;

import java.util.Scanner;

public class DogKennel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog[] dogs = new Dog[3];
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Enter the dog name: ");
            String name = scanner.next();
            System.out.println("Enter the dog age: ");
            int age = scanner.nextInt();
            dogs[i] = new Dog(age, name);
        }
        for(int i = 0; i < dogs.length; i++)
        {
            System.out.println(dogs[i].toString());
        }
    }
}
