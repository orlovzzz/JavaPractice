package Ex10;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop implements Input {
    ArrayList<Computer> pcs = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    @Override
    public void input() {
        int price;
        Computer PC;
        String s = "";
        while (!s.equals("End")) {
            System.out.println("Enter End if you want stop add computers.");
            Brands[] brand = Brands.values();
            System.out.println("Choice brand: ");
            for (Brands i : brand) {
                if (i == Brands.Asus) {
                    System.out.println(i + ".");
                    break;
                }
                System.out.print(i + ", ");
            }
            s = in.nextLine();
            switch (s) {
                case "Microsoft":
                    System.out.println("Enter price, speed, memory, size.");
                    price = in.nextInt();
                    in.nextLine();
                    pcs.add(new Computer(price, Brands.Microsoft.getBrand(), in.nextLine(), in.nextLine(), in.nextLine()));
                    break;
                case "Apple":
                    System.out.println("Enter price, speed, memory, size.");
                    price = in.nextInt();
                    in.nextLine();
                    pcs.add(new Computer(price, Brands.Apple.getBrand(), in.nextLine(), in.nextLine(), in.nextLine()));
                    break;
                case "Asus":
                    System.out.println("Enter price, speed, memory, size.");
                    price = in.nextInt();
                    in.nextLine();
                    pcs.add(new Computer(price, Brands.Asus.getBrand(), in.nextLine(), in.nextLine(), in.nextLine()));
                    break;
                case "Samsung":
                    System.out.println("Enter price, speed, memory, size.");
                    price = in.nextInt();
                    in.nextLine();
                    pcs.add(new Computer(price, Brands.Samsung.getBrand(), in.nextLine(), in.nextLine(), in.nextLine()));
                    break;
                case "Lenovo":
                    System.out.println("Enter price, speed, memory, size.");
                    price = in.nextInt();
                    in.nextLine();
                    pcs.add(new Computer(price, Brands.Lenovo.getBrand(), in.nextLine(), in.nextLine(), in.nextLine()));
                    break;
                default:
                    System.out.println("Wrong name.");
                    break;
            }
        }
    }

    public void deletePC () {
        output();
        System.out.println("Choice number computer to delete");
        int n = in.nextInt();
        if (n > pcs.size()) {
            System.out.println("Wrong number");
        } else {
            pcs.remove(n - 1);
        }
    }

    public void output() {
        if (pcs.size() == 0) {
            System.out.println();
            System.out.println("Catalog is empty");
            return;
        }
        for (int i = 0; i < pcs.size(); i++) {
            System.out.println();
            System.out.println(pcs.get(i).toString());
        }
    }

    public void search() {
        System.out.println("Enter brand to search: ");
        String s = in.nextLine();
        int count = 0;
        for (int i = 0; i < pcs.size(); i++) {
            if (pcs.get(i).getBrand().equals(s)) {
                System.out.println();
                System.out.println(pcs.get(i).toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There are no computers of this brand in the store");
        }
    }
}
