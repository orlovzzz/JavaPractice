package Shape_;

import java.awt.*;

public class Square extends Rectangle {

    public Square() {}

    Square(double side) {
        this.width = side;
        this.length = side;
    }

    public Square(double side, Color color, boolean filled) {
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Shape.Rectangle { \n" +
                "   Side: " + width + "\n" +
                "   Color: " + color + "\n" +
                "   Filled: " + filled + "\n}";
    }
}
