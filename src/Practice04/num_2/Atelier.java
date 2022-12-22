package Practice04.num_2;

public enum Atelier {
    XXS(32), XS(34), S(36), M(38), L(40);
    public int euroSize;
    Atelier(int euroSize){ this.euroSize = euroSize;}
    public String getDescription(Atelier size)
    {
        if(size == XXS) return "Child size";
        else return "Adult size";
    }

    public static void main(String[] args) {
        for(Atelier size : Atelier.values())
            System.out.println(size.toString() + " " + size.getDescription(size));
    }
}
