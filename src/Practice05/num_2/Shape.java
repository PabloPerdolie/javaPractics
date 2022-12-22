package Practice05.num_2;

public class Shape {
    private int color, x, y;

    public int getColor() {
        this.color = (int) (Math.random() * 0x1000000);
        return color;
    }

    public int getX() {
        this.x = (int) (Math.random() * 600);
        return x;
    }

    public int getY() {
        this.y = (int) (Math.random() * 600);
        return y;
    }
}