public class Airplane extends Transport{

    Airplane(double consumption, double speed, double kilometers, double fuelPrice) {
        super(consumption, speed, kilometers, fuelPrice);
    }

    public String toString() {
        return "Airplane {" + "\n" +
                "   Consumption: " + consumption + " oil/km\n" +
                "   Fuel price: " + fuelPrice + " $\n" +
                "   Speed: " + speed + " km/h\n" +
                "   Kilometers: " + kilometers + " km";
    }
}