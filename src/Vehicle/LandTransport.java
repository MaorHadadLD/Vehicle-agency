package Vehicle;

public abstract class LandTransport extends TransportationVehicle {

    private int numOfWheels;
    private String roadType;
    private String powerSource;
    private String energyScore;
    private double avgFuel;
    private int avgLifetime;

    public LandTransport(String model, int maxPassengers, int maxSpeed, String dirt) {
        super(model, maxPassengers, maxSpeed);
        this.numOfWheels = 0;
        this.roadType = "";
        this.powerSource = "";
        this.energyScore = "";
        this.avgFuel = 0.0;
        this.avgLifetime = 0;


    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numOfWheels = numberOfWheels;
    }

    public void setTypeOfRoad(String typeOfRoad) {
        this.roadType = typeOfRoad;
    }

    public int getNumberOfWheels() {
        return numOfWheels;
    }

    public String getTypeOfRoad() {
        return roadType;
    }

    public String toString() {
        return super.toString() + ", Num wheels: " + numOfWheels +
                ", Road type: " + roadType;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj) || getClass() != obj.getClass())
            return false;

        LandTransport other = (LandTransport) obj;
        return numOfWheels == other.numOfWheels &&
                roadType.equals(other.roadType);
    }
}

