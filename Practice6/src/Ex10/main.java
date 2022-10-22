package Ex10;

import java.util.Scanner;

enum Brands {
    Microsoft {
        public String getBrand() {
            return "Microsoft";
        }
    }, Apple {
        public String getBrand() {
            return "Apple";
        }
    }, Samsung {
        public String getBrand() {
            return "Samsung";
        }
    }, Lenovo {
        public String getBrand() {
            return "Lenovo";
        }
    }, Asus {
        public String getBrand() {
            return "Asus";
        }
    };
    public abstract String getBrand();
}

public class main {
    public static void main(String[] args) {
        Input obj = new Shop();
        int n = 1;
        while (n == 1 || n == 2 || n == 3 || n == 4) {
            System.out.println("What do you want to do?\n1 - add computer in catalog\n2 - check catalog\n3 - delete computer\n4 - search computer");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            in.nextLine();
            switch (n) {
                case (1):
                    obj.input();
                    break;
                case (2):
                    ((Shop) obj).output();
                    System.out.println();
                    break;
                case (3):
                    ((Shop) obj).deletePC();
                    break;
                case (4):
                    ((Shop) obj).search();
                    System.out.println(1);
                    break;
            }
        }
    }
}