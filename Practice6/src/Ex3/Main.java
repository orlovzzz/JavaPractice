package Ex3;

import Ex1.MovablePoint;
import Ex2.MovableRectangle;

public class Main {
    public static void main(String[] args) {
        Nameable obj = new MovableRectangle(1, 1, 1, 1, 1, 1);
        System.out.println(obj.getName());
        obj = new MovablePoint(1, 1, 1, 1);
        System.out.println(obj.getName());
    }
}
