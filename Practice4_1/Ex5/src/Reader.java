public class Reader {
    private String name;
    private int numberReaderTicket;
    private String birthDate;
    private String faculty;
    private String phoneNumber;

    Reader(String name) {
        this.name = name;
    }

    Reader(String name, int numberReaderTicket, String birthDate, String faculty, String phoneNumber) {
        this.name = name;
        this.numberReaderTicket = numberReaderTicket;
        this.birthDate = birthDate;
        this.faculty = faculty;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int n) {
        System.out.println(name + " take " + n + " books.");
    }

    public void takeBook(String s) {
        System.out.println(name + " take books: " + s + ".");
    }

    public void takeBook(Book[] mas) {
        System.out.print(name + "take: ");
        for (int i = 0; i < mas.length; i++) {
            if (i == mas.length - 1) {
                System.out.println(mas[i].getNameBook() + ".");
                return;
            }
            System.out.print(mas[i].getNameBook() + ", ");
        }
    }

    public void returnBook(Book[] mas) {
        System.out.print(name + "return: ");
        for (int i = 0; i < mas.length; i++) {
            if (i == mas.length - 1) {
                System.out.println(mas[i].getNameBook() + ".");
                return;
            }
            System.out.print(mas[i].getNameBook() + ", ");
        }
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " " + numberReaderTicket + " " + birthDate + " " + faculty + " " + phoneNumber;
    }
}