package Ex1;

import Ex3.Nameable;

public class MovablePoint implements Movable, Nameable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    @Override
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

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "MovablePoint {\n" +
        "   x = " + x + "\n" +
        "   y = " + y + "\n" +
        "   xSpeed = " + xSpeed + "\n" +
        "   ySpeed = " + ySpeed + "\n}";
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    public String getName() {
        return "MovablePoint";
    }
}