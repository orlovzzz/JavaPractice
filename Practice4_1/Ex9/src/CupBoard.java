public class CupBoard extends Furniture {


    CupBoard(double width, double height, int price, String color) {
        super(width, height, price, color);
    }

    @Override
    public String toString() {
        return "Cupboard: " + "\n" +
                "   Width: " + width + "\n" +
                "   Height: " + height + "\n" +
                "   Color: " + color + "\n" +
                "   Price: "  + price + "$\n}";
    }
}
