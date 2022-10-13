public class Skirt extends Clothes implements WomanClothing{

    public Skirt(Size clothesSize, int price, String color) {
        this.clothesSize = clothesSize;
        this.color = color;
        this.price = price;
    }

    public String dressWoman() {
        String s = "Skirt, " + "size: " + this.clothesSize + ", euro size: " + this.clothesSize.getEuroSize() + ", price: " +
                this.price + "$, color: " + this.color + ", size type: " + this.clothesSize.getDescription() + "\n";
        return s;
    }
}