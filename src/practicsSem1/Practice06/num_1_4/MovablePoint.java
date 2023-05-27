package practicsSem1.Practice06.num_1_4;

public class MovablePoint implements Movable, Nameable, Priceable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp(int y) {
        this.y += y;
    }

    public void moveDown(int y) {
        this.y -= y;
    }

    public void moveLeft(int x) {
        this.x -= x;
    }

    public void moveRight(int x) {
        this.x += x;
    }

    @Override
    public String toString() {
        return "Point: x = " + x + ", y = " + y;
    }

    @Override
    public String getName() {
        return "Point";
    }

    @Override
    public int getPrice() {
        return 20;
    }
}
