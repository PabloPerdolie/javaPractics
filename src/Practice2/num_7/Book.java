package Practice2.num_7;

public class Book {
    String author;
    String name;
    int year;
    Book(String author, String name, int year)
    {
        setAuthor(author);
        setName(name);
        setYear(year);
    }
    public void setAuthor(String author) {this.author = author;}
    public void setName(String name) {this.name = name;}
    public void setYear(int year) {this.year = year;}
    public int getYear() {return year;}
    public String getAuthor() {return author;}
    public String getName()  {return name;}
    public String toString() {
        return "Author = " + author + ", name = " + name + ", year = " + year;
    }
}
