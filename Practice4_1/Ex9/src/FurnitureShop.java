public class FurnitureShop {

    public void showShop() {
        Furniture obj = new CupBoard(10, 15, 1000, "red") ;
        System.out.println(obj.toString());
        obj = new Table(10, 15, 5, "black", 1500);
        System.out.println(obj.toString());
        obj = new ShoeRack(7, 8, 6, 5, "white", 500);
        System.out.println(obj.toString());
    }

}
