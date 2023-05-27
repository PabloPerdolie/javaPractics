package practicsSem1.Practice13.num_5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Введите номер телефона: ");
        var phone = scanner.nextLine();
        while (!((phone.charAt(0) == '+' && phone.length() >= 12) || (phone.charAt(0) == '8' && phone.length() == 11))) {

            System.out.print("Введите номер телефона: ");
            phone = scanner.nextLine();
        }
        System.out.println(PhoneFormat.format(phone));
    }
}
