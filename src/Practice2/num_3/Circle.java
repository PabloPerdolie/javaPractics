package Practice2.num_3;

public class Circle extends Point {
    public double R;
    public void setR(double R) {this.R = R;}
    public double getR() {return R;}
    public Circle(double R, double x, double y)
    {
        this.R = R;
        this.x = x;
        this.y = y;
    }

}
