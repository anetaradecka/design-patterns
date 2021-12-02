package cars;

public abstract class Car {

    private final String engineVolume;
    private final String fuelType;
    private final String productionYear;
    private final SteeringWheelPosition position;

    protected Car(String engineVolume, String fuelType, String productionYear, SteeringWheelPosition position) {
        this.engineVolume = engineVolume;
        this.fuelType = fuelType;
        this.productionYear = productionYear;
        this.position = position;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return position;
    }
}
