package Practice6.num_6_9;

public class Book implements Printable{

    String name;
    String author;

    Book(String name, String author)
    {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Book: " + name + ", " + author);
    }

    public static void printBooks(Printable[] printables)
    {
        for(int i = 0; i < printables.length; i++)
            if(printables[i] instanceof Book)
                System.out.println("Book: " + ((Book) printables[i]).name + ", " + ((Book) printables[i]).author);
    }

}
