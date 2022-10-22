package Ex1;

import Ex3.Nameable;

public class MovableCircle implements Movable, Nameable {
    private int radius;
    MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "MovablePoint {\n" +
                "   radius = " + radius + "\n}";
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

    public String getName() {
        return "MovableCircle";
    }
}
