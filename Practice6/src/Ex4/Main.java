package Ex4;

public class Main {
    public static void main(String[] args) {
        Priceable obj = new Car();
        System.out.println("Car price: " + obj.getPrice());
        obj = new Food();
        System.out.println("Food price: " + obj.getPrice());
    }
}
