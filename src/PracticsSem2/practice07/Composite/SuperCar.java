package PracticsSem2.practice07.Composite;

public class SuperCar implements Car{
    @Override
    public void draw(String color){
        System.out.println("Суперкар имеет "+color+" цвет");
    }
}
