package PracticsSem2.practice06.Builder;

public class Main {
    public static void main(String[] args) {
        Human human = new Human.HumanBuilder("Pasha", 20).set_has_car(true).set_has_iphone(false).build();
        System.out.println(human);
    }
}
