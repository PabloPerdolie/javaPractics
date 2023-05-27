package PracticsSem2.practice07.Bridge;

public class Rectangle extends Shape{
    public Rectangle(Color color){
        super(color);
    }
    @Override
    public void draw(){
        System.out.println("Рисуем прямоугольник");
        color.fillColor();
    }
}
