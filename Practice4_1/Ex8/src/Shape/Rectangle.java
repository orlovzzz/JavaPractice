package Shape;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    Rectangle() {}

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
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
}
