public class Table extends Furniture{
    private double length;

    Table(double length, double width, double height, String color, int price) {
        super(width, height, price, color);
        this.length = length;
    }

    @Override
    public String toString() {
        return "Table: " + "\n" +
                "   Length: " + length + "\n" +
                "   Width: " + width + "\n" +
                "   Height: " + height + "\n" +
                "   Color: " + color + "\n" +
                "   Price: "  + price + "$\n}";
    }
}