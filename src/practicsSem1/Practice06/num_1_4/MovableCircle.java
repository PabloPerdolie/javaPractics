package practicsSem1.Practice06.num_1_4;

public class MovableCircle extends MovablePoint implements Movable, Nameable, Priceable {
    MovablePoint center;
    int radius;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp(int y) {
        super.moveUp(y);
    }

    public void moveDown(int y) {
        super.moveDown(y);
    }

    public void moveRight(int x) {
        super.moveRight(x);
    }

    public void moveLeft(int x) {
        super.moveLeft(x);
    }

    @Override
    public String toString() {
        return "Center " + super.toString() + ", radius = " + radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
