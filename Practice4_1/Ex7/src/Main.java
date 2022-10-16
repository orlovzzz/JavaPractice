import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Pupil[] pupils = new Pupil[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                pupils[i] = new Student((char)(random.nextInt(25) + 'A'),
                        17 + random.nextInt(60),
                        "IKBO-" + (1 + random.nextInt(29)) + "-" + (10 + random.nextInt(12)));
            } else {
                pupils[i] = new SchoolBoy((char)(random.nextInt(25) + 'A'), 6 + random.nextInt(12),
                        (1 + random.nextInt(10)) + Character.toString(((char)('A' + random.nextInt(25)))));
            }
        }
        for (int i = 0; i < 5; i++) {
                System.out.println(pupils[i].toString());
        }
    }
}