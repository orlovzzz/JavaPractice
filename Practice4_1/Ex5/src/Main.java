import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Reader[] readers = new Reader[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter library cart number, name, faculty, birth date, phone number.");
            //int cart = in.nextInt();in.nextLine();
            readers[i] = new Reader(in.nextLine());
            //readers[i] = new Reader(in.nextLine(), cart, in.nextLine(), in.nextLine(), in.nextLine());
            System.out.println("How many books take " + readers[i].getName() + "?");
            int n = in.nextInt();in.nextLine();
            Book[] books = new Book[n];
            if (i != 1) {
                for (int j = 0; j < n; j++) {
                    System.out.println("Enter book name and author.");
                    books[j] = new Book(in.nextLine(), in.nextLine());
                }
                readers[i].takeBook(n);
                readers[i].takeBook(getString(books));
                readers[i].takeBook(books);
            } else {
                for (int j = 0; j < n; j++) {
                    System.out.println("Enter book name and author.");
                    books[j] = new Book(in.nextLine(), in.nextLine());
                }
                readers[i].returnBook(books);
            }
        }
    }

    public static String getString(Book[] books) {
        String s = "";
        for (int i = 0; i < books.length; i++) {
            if (i == books.length - 1) {
                s += books[i].getNameBook();
                return s;
            }
            s += books[i].getNameBook() + ", ";
        }
        return "";
    }
}