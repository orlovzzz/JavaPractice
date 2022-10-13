import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Shape obj = new Rectangle(in.nextLine(), in.nextInt(), in.nextInt());
        System.out.println(obj.toString());
        in.nextLine();
        obj = new Circle(in.nextLine(), in.nextInt());
        System.out.println(obj.toString());
    }
}