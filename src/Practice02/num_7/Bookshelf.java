package Practice02.num_7;

public class Bookshelf{
    private Book[] mas;
    private int size;
    private int current = 0;
    Bookshelf(int size)
    {
        this.size = size;
        mas = new Book[size];
    }
    public void push_back(Book book)
    {
        mas[current] = book;
        current++;
    }
    public Book LateBook()
    {
        int max = 0;
        int mx = 0;
        for(int i = 0; i < current; i++)
        {
            if(mas[i].getYear() > max) {
                mx = i;
                max = mas[i].getYear();
            }
        }
        return mas[mx];
    }
    public Book EarlyBook()
    {
        int min = 3000;
        int mn = 0;
        for(int i = 0; i < current; i++)
        {
            if(mas[i].getYear() < min) {
                mn = i;
                min = mas[i].getYear();
            }
        }
        return mas[mn];
    }
    public void sort()
    {
        Book time = new Book("", "", 0);
        for(int i = 0; i < current - 1; i++)
        {
            for(int j = 0; j < current - i - 1; j++)
            {
                if(mas[j].getYear() > mas[j + 1].getYear())
                {
                    time = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = time;
                }
            }
        }
    }
    public void Print()
    {
        for(int i = 0; i < current; i++) System.out.println(mas[i].toString());
    }
}
