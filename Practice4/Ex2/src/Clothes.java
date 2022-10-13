public abstract class Clothes {
    protected Size clothesSize;
    protected int price;
    protected String color;
    Clothes() {
    }

    public Size getClothesSize() {
        return clothesSize;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setClothesSize(Size clothesSize) {
        this.clothesSize = clothesSize;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
