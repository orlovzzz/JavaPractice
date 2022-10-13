public class Circle extends Shape{

    Circle(String name, int r){
        this.name = name;
        this.perimeter = 2 * r * Math.PI;
        this.square = Math.PI * r * r;
    }

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
