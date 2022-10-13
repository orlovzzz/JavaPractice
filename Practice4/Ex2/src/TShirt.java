public class TShirt extends Clothes implements MenClothing, WomanClothing{

    public TShirt(Size clothesSize, int price, String color) {
        this.clothesSize = clothesSize;
        this.color = color;
        this.price = price;
    }

    public String dressMan() {
        String s = "TShirt," + " size: " + this.clothesSize + ", euro size: " + this.clothesSize.getEuroSize() + ", price: " +
                this.price + "$, color: " + this.color + ", size type: " + this.clothesSize.getDescription() + "\n";
        return s;
    }
    public String dressWoman() {
        return dressMan();
    }
}