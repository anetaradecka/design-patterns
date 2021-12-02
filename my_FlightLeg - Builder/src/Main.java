import FlightLeg.FlightLeg;

public class Main {
    public static void main(String[] args) {

        FlightLeg.FlightLegBuilder editable = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles");

        FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles").price(50).build();

        System.out.println(leg);

        editable.price(9);

        System.out.println(leg);

        FlightLeg done = editable.build();
    }

}
