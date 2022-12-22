package Practice06.num_6_9;

public class Magazine implements Printable{

    String name;
    String creator;

    public Magazine(String name, String creator) {
        this.name = name;
        this.creator = creator;
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + name + ", " + creator);
    }
    public static void printBooks(Printable[] printables)
    {
        for(int i = 0; i < printables.length; i++)
            if(printables[i] instanceof Magazine)
                System.out.println("Book: " + ((Magazine) printables[i]).name + ", " + ((Magazine) printables[i]).creator);
    }
}
