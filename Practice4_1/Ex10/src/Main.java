public class Main {
    public static void main(String[] args) {
        Transport obj = new Car(0.1, 80, 100, 1.087);
        System.out.println(obj.toString());
        obj.getTransitPrice();
        obj.getTime();
        obj = new Airplane(0.0473, 350, 1500, 0.93);
        System.out.println(obj.toString());
        obj.getTransitPrice();
        obj.getTime();
        obj = new Train(1.6, 90, 1000, 0.82);
        System.out.println(obj.toString());
        obj.getTransitPrice();
        obj.getTime();
        obj = new Ship(0.25, 74.08, 800, 0.93);
        System.out.println(obj.toString());
        obj.getTransitPrice();
        obj.getTime();
    }
}