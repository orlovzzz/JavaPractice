package Ex6_7_8_9;

public class Main {
    public static void main(String[] args) {
        Printable[] obj = new Printable[10];
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                obj[i] = new Book();
                obj[i].print();
            } else {
                obj[i] = new Shop();
                obj[i].print();
            }
        }
    }
}
