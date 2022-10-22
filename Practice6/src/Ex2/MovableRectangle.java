package Ex2;

import Ex1.*;
import Ex3.Nameable;

public class MovableRectangle implements Movable, Nameable {
    private MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public void moveDown() {
    }

    @Override
    public void moveLeft() {
    }

    @Override
    public void moveRight() {
    }

    @Override
    public void moveUp() {
    }

    public boolean isSpeedX() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed();
    }

    public boolean isSpeedY() {
        return topLeft.getYSpeed() == bottomRight.getYSpeed();
    }

    @Override
    public String toString() {
        return bottomRight.toString() + "\n" + topLeft.toString();
    }

    public String getName() {
        return "MovableRectangle";
    }
}
