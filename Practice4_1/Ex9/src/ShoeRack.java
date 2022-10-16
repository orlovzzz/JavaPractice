public class ShoeRack extends Furniture {
    private int floorsNumber;
    private double length;

    ShoeRack(double length, double width, double height, int floorsNumber, String color, int price) {
        super(width, height, price, color);
        this.length = length;
        this.floorsNumber = floorsNumber;
    }

    @Override
    public String toString() {
        return "Shoe rack: " + "\n" +
                "   Length: " + length + "\n" +
                "   Width: " + width + "\n" +
                "   Height: " + height + "\n" +
                "   Number of floors: " + floorsNumber + "\n" +
                "   Color: " + color + "\n" +
                "   Price: "  + price + "$\n}";
    }
}
