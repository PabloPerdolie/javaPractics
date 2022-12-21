package Practice2.num_6;

public class Circle {
    double x;
    double y;
    double R;
    Circle(double x, double y, double R)
    {
        this.x= x;
        this.y = y;
        this.R = R;
    }
    public double getX() {return x;}
    public double getY() {return y;}
    public double getR() {return R;}
    public void setXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public void setR(double R)
    {
        this.R = R;
    }
    public double getSquare() {return R*R*Math.PI;}
    public double getLength() {return 2*R*Math.PI;}
    /*public boolean Comparison(Circle circle)
    {
        if(R > circle.getR())
            return true;
        else return false;
    }*/

    public String toString() {
        return "R = " + R + ", x = " + x + ", y = " + y;
    }
}
