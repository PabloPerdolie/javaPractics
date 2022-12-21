package Practice2.num_1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        String name, email; char gender;
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        email = scanner.next();
        gender = scanner.next().charAt(0);
        Author author = new Author(name, email, gender);
        System.out.println("Name - " + author.getName() +
                ", email - " + author.getEmail() +
                ", gender - " + author.getGender());
    }
}
