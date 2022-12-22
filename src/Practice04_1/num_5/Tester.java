package Practice04_1.num_5;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fio, number of reader ticket, date of BD, phone number: ");
        String fio = sc.next();
        int num = sc.nextInt();
        String dateOfBD = sc.next();
        String phoneNum = sc.next();
        Reader reader = new Reader(fio, num, dateOfBD, phoneNum);
        System.out.println("1.Take book\n2.Return book");
        int menu = sc.nextInt();
        int n;
        switch (menu) {
            case 1:
                System.out.println("1.Number of books\n2.Names of books\n3.Names and authors of books");
                menu = sc.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("Enter the number of books: ");
                        n = sc.nextInt();
                        reader.takeBook(n);
                        break;
                    case 2:
                        System.out.println("Enter the number of books: ");
                        n = sc.nextInt();
                        String[] mas = new String[n];
                        System.out.println("Enter the books names: ");
                        for (int i = 0; i < n; i++) {
                            mas[i] = sc.nextLine();
                        }
                        reader.takeBook(mas);
                        break;
                    case 3:
                        System.out.println("Enter the number of books: ");
                        n = sc.nextInt();
                        Book[] mas1 = new Book[n];
                        System.out.println("Enter the books names and authors: ");
                        for (int i = 0; i < n; i++) {
                            mas1[i].name = sc.nextLine();
                            mas1[i].author = sc.nextLine();
                        }
                        reader.takeBook(mas1);
                        break;
                }
            case 2:
                System.out.println("1.Number of books\n2.Names of books\n3.Names and authors of books");
                menu = sc.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("Enter the number of books: ");
                        n = sc.nextInt();
                        reader.returnBook(n);
                        break;
                    case 2:
                        System.out.println("Enter the number of books: ");
                        n = sc.nextInt();
                        String[] mas = new String[n];
                        System.out.println("Enter the books names: ");
                        for (int i = 0; i < n; i++) {
                            mas[i] = sc.nextLine();
                        }
                        reader.returnBook(mas);
                        break;
                    case 3:
                        System.out.println("Enter the number of books: ");
                        n = sc.nextInt();
                        Book[] mas1 = new Book[n];
                        System.out.println("Enter the books names and authors: ");
                        for (int i = 0; i < n; i++) {
                            mas1[i].name = sc.nextLine();
                            mas1[i].author = sc.nextLine();
                        }
                        reader.returnBook(mas1);
                        break;
                }

        }
    }
}
