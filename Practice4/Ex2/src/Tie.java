public class Tie extends Clothes implements MenClothing{

    public Tie(Size clothesSize, int price, String color) {
        this.clothesSize = clothesSize;
        this.color = color;
        this.price = price;
    }

    public String dressMan() {
        String s = "Tie," + " size: " + this.clothesSize + ", euro size: " + this.clothesSize.getEuroSize() + ", price: " +
                this.price + "$, color: " + this.color + ", size type: " + this.clothesSize.getDescription() + "\n";
        return s;
    }

}