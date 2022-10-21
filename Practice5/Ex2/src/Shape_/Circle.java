package Shape_;

import java.awt.*;

public class Circle extends Shape1 {
    protected double radius;

    Circle() {}
    Circle(double radius) { this.radius = radius; }

    public Circle(double radius, Color color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Shape.Circle { \n" +
                "   Radius: " + radius +
                "\n" +
                "   Color: " + color + "\n" +
                "   Filled: " + filled + "\n}";
    }
}
