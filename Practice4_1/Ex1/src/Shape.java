public class Shape {
    protected String name;
    protected double square;
    protected double perimeter;

    public String getType() {
        return this.name;
    }

    public double getArea() {
        return square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public String toString() {
        return "Name: " + getType() + ", square: " + getArea() + ", perimeter: " + getPerimeter() ;
    }
}
