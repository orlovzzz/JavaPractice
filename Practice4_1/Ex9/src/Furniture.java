public abstract class Furniture {
    protected double width;
    protected double height;
    protected String color;
    protected int price;

    Furniture() {}

    Furniture(double width, double height, int price, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.price = price;
    }

    public abstract String toString();
}
