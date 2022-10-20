package Shape;

public class Main {
    public static void main(String[] args) {
        Shape obj = new Circle(10, "red", true);
        System.out.println("Shape.Circle perimeter: " + obj.getPerimeter());
        System.out.println("Shape.Circle area: " + obj.getArea());
        System.out.println(obj.toString());
        obj = new Rectangle(3, 4, "blue", false);
        System.out.println("Shape.Rectangle perimeter: " + obj.getPerimeter());
        System.out.println("Shape.Rectangle area: " + obj.getArea());
        System.out.println(obj.toString());
        obj = new Square(5, "black", true);
        System.out.println("Shape.Square perimeter: " + obj.getPerimeter());
        System.out.println("Shape.Square area: " + obj.getArea());
        System.out.println(obj.toString());
    }
}