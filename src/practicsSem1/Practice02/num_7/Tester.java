package Practics.Practice02.num_7;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        size = scanner.nextInt();
        Bookshelf bookshelf = new Bookshelf(size);
        for(int i = 0; i < size; i++)
        {
            String author = scanner.next();
            String name = scanner.next();
            int year = scanner.nextInt();
            Book book = new Book(author, name, year);
            bookshelf.push_back(book);
        }
        System.out.println(bookshelf.EarlyBook());
        System.out.println(bookshelf.LateBook());
        bookshelf.sort();
        bookshelf.Print();
    }
}
