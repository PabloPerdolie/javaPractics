package PracticsSem2.practice07.Composite;

public class SportCar implements Car{
    @Override
    public void draw(String color){
        System.out.println("Спорткар имеет "+color+" цвет");
    }
}
