public class Pants extends Clothes implements MenClothing, WomanClothing{

    public Pants(Size clothesSize, int price, String color) {
        this.clothesSize = clothesSize;
        this.color = color;
        this.price = price;
    }

    public String dressMan() {
        String s = "Pants, " + "size: " + this.clothesSize + ", euro size: " + this.clothesSize.getEuroSize() + ", price: " +
                this.price + "$, color: " + this.color + ", size type: " + this.clothesSize.getDescription() + "\n";
        return s;
    }
    public String dressWoman() { return dressMan(); }
}