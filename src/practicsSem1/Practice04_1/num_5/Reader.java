package practicsSem1.Practice04_1.num_5;

public class Reader {
    String fio;
    int num;
    String dateOfBD;
    String phoneNum;

    public Reader(String fio, int num, String dateOfBD, String phoneNum) {
        this.fio = fio;
        this.num = num;
        this.dateOfBD = dateOfBD;
        this.phoneNum = phoneNum;
    }

    void takeBook(int n) {
        System.out.println(fio + "took " + n + " books.");
    }

    void takeBook(String[] names) {
        System.out.printf(fio + " took books: ");
        for (int i = 0; i < names.length; i++) {
            if (i == names.length) {
                System.out.printf(names[i]);
                break;
            }
            System.out.printf(names[i] + ", ");
        }
    }

    void takeBook(Book[] books) {
        System.out.printf(fio + " took books: " + books[0].name);
        for (int i = 1; i < books.length; i++) {
            System.out.printf(", " + books[i].name);
        }

    }

    void returnBook(int n) {
        System.out.println(fio + "returned " + n + " books.");
    }

    void returnBook(String[] names) {
        System.out.printf(fio + " returned books: ");
        for (int i = 0; i < names.length; i++) {
            if (i == names.length) {
                System.out.printf(names[i]);
                break;
            }
            System.out.printf(names[i] + ", ");
        }
    }

    void returnBook(Book[] books) {
        System.out.printf(fio + " returned books: " + books[0].name);
        for (int i = 1; i < books.length; i++) {
            System.out.printf(", " + books[i].name);
        }

    }
}
