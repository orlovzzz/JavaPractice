public class Car extends Transport {

    Car(double consumption, double speed, double kilometers, double fuelPrice) {
        super(consumption, speed, kilometers, fuelPrice);
    }

    public String toString() {
        return "Car {" + "\n" +
                "   Consumption: " + consumption + " oil/km\n" +
                "   Fuel price: " + fuelPrice + " $\n" +
                "   Speed: " + speed + " km/h\n" +
                "   Kilometers: " + kilometers + " km";
    }
}