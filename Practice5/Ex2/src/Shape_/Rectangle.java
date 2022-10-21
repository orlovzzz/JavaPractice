package Shape_;

import java.awt.*;

public class Rectangle extends Shape1 {
    protected double width;
    protected double length;

    public Rectangle() {}

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, Color color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    public String toString() {
        return "Shape.Rectangle { \n" +
                "   Width: " + width + "\n" +
                "   Length: " + length + "\n" +
                "   Color: " + color + "\n" +
                "   Filled: " + filled + "\n}";
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
