public class Reader {
    private String name;
    private int numberReaderTicket;
    private String birthDate;
    private String faculty;
    private String phoneNumber;

    public void takeBook(int n) {
        System.out.println(name + "take" + n + "books.");
    }

    public void takeBook(String s) {
        System.out.println(name + "take books: " + s + ".");
    }

    public void takeBook(Book[] mas) {

    }
}
