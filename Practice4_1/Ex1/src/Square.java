public class Square extends Shape{

    Square(String name, int a){
        this.name = name;
        this.square = a * a;
        this.perimeter = a * 4;
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
