public class Main {
    public static void main(String[] args) {
        Phone obj1 = new Phone();
        Phone obj2 = new Phone();
        Phone obj3 = new Phone();
        System.out.println(obj1.getModel() + " " + obj1.getNumber() + " " + obj1.getWeight());
        System.out.println(obj2.getModel() + " " + obj2.getNumber() + " " + obj2.getWeight());
        System.out.println(obj3.getModel() + " " + obj3.getNumber() + " " + obj3.getWeight());
        obj1.receiveCall("Artem");
        obj1.receiveCall("Artem", "+79999999999.");
        obj1.sendMessage("+78888888888");
    }
}