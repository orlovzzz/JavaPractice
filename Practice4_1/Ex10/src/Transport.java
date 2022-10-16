public abstract class Transport {
    protected double consumption;
    protected double speed;
    protected double kilometers;
    protected double fuelPrice;

    Transport(double consumption, double speed, double kilometers, double oilPrice) {
        this.consumption = consumption;
        this.speed = speed;
        this.kilometers = kilometers;
        this.fuelPrice = oilPrice;
    }

    public void getTime() {
        System.out.println("Transit time = " + kilometers / speed + " hours");
    }

    public void getTransitPrice() {
        System.out.println("Transit price = " + fuelPrice * kilometers + " $");
    }

    public abstract String toString();
}