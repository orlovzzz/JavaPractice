package Ex1;

public class Main {
    public static void main(String[] args) {
        Movable obj = new MovablePoint(1, 1, 1, 1);
        System.out.println(obj.toString());
        obj = new MovableCircle(1, 1, 1, 1, 1);
        System.out.println(obj.toString());
    }
}
