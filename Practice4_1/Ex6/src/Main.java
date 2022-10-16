import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employer obj = new Manager("A", "B", 10000, 5000);
        System.out.println("Salary " + obj.firstName + " " + obj.secondName + " = " + obj.getIncome() + " rub.");
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        Employer[] personal = new Employer[4];
        for (int i = 0; i < 4; i++) {
            if (i % 2 != 0) {
                personal[i] = new Employer("A" + i, "B" + i, 10000 + random.nextInt(50000));
            } else {
                personal[i] = new Manager("A" + i, "B" + i, 10000 + random.nextInt(50000), random.nextInt(10000));
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Salary " + personal[i].firstName + " " + personal[i].secondName + " = " + personal[i].getIncome() + " rub.");
        }
    }
}
