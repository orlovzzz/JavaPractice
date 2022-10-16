public class Main {
    public static void main(String[] args) {
        Shape obj = new Circle(10, "red", true);
        System.out.println("Circle perimeter: " + obj.getPerimeter());
        System.out.println("Circle area: " + obj.getArea());
        System.out.println(obj.toString());
        obj = new Rectangle(3, 4, "blue", false);
        System.out.println("Rectangle perimeter: " + obj.getPerimeter());
        System.out.println("Rectangle area: " + obj.getArea());
        System.out.println(obj.toString());
        obj = new Square(5, "black", true);
        System.out.println("Square perimeter: " + obj.getPerimeter());
        System.out.println("Square area: " + obj.getArea());
        System.out.println(obj.toString());
    }
}