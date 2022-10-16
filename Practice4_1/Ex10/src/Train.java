public class Train extends Transport{

    Train(double consumption, double speed, double kilometers, double fuelPrice) {
        super(consumption, speed, kilometers, fuelPrice);
    }

    public String toString() {
        return "Train {" + "\n" +
                "   Consumption: " + consumption + " oil/km\n" +
                "   Fuel price: " + fuelPrice + " $\n" +
                "   Speed: " + speed + " km/h\n" +
                "   Kilometers: " + kilometers + " km";
    }
}