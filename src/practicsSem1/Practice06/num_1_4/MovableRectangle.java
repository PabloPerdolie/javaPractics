package Practics.Practice06.num_1_4;

public class MovableRectangle extends MovablePoint implements Movable, Nameable, Priceable {
    MovablePoint topLeft;
    MovablePoint bottomRight;
    MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed)
    {
        super(x2 - x1, y1 - y2, xSpeed, ySpeed);
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp(int y) {
        super.moveUp(y);
        topLeft.moveUp(y);
        bottomRight.moveUp(y);
    }

    public void moveDown(int y) {
        super.moveDown(y);
        topLeft.moveDown(y);
        bottomRight.moveDown(y);
    }
    public void moveRight(int y) {
        super.moveRight(y);
        topLeft.moveRight(y);
        bottomRight.moveRight(y);
    }
    public void moveLeft(int y) {
        super.moveLeft(y);
        topLeft.moveLeft(y);
        bottomRight.moveLeft(y);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public int getPrice() {
        return 30;
    }
}
