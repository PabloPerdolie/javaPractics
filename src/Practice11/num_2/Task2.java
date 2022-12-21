package Practice11.num_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате dd-MM-yyyy: ");
        String dateString = scanner.next("[0-9]{2}-[0-9]{2}-[0-9]{4}");
        SimpleDateFormat dateParser = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = dateParser.parse(dateString);
            System.out.println(date.before(new Date())
                    ? "Введённая дата раньше системного времени."
                    : "Введённая дата позже системного времени.");
        } catch (ParseException exception) {
            System.out.println("Введена неверная дата.");
        }
    }
}
