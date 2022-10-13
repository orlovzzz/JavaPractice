public class Rectangle extends Shape{

    Rectangle(String name, int a, int b){
        this.name = name;
        this.perimeter = 2 * (a + b);
        this.square = a * b;
    }
    @Override
    public String getType() {
        return this.name;
    }
    @Override
    public double getArea() {
        return square;
    }
    @Override
    public double getPerimeter() {
        return perimeter;
    }
    @Override
    public String toString() {
        return "Name: " + getType() + ", square: " + getArea() + ", perimeter: " + getPerimeter() ;
    }
}
