package PracticsSem2.practice07.Bridge;

public class GreenColor implements Color {
    @Override
    public void fillColor() {
        System.out.println("Зарисовка зеленным цветом");
    }
}
