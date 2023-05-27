package practicsSem1.Practice11.num_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        try {
            Date date = new SimpleDateFormat("yyyy MM dd hh mm")
                    .parse(String.format("%d %d %d %d %d", year, month, day, hours, minutes));
            Calendar calendar = new GregorianCalendar();
            calendar.set(year, month, day, hours, minutes);
            System.out.println(date);
            System.out.println(calendar);
        } catch (ParseException exception) {
            System.out.println("Введена неверная дата.");
        }
    }
}
