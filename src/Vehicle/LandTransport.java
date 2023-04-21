package Vehicle;

/**
 The LandTransport class is an abstract class that extends TransportationVehicle

 and represents land-based transportation vehicles.
 */
public abstract class LandTransport extends TransportationVehicle {

    private int numOfWheels;
    private String roadType;
    private String powerSource;
    private String energyScore;
    private double avgFuel;
    private int avgLifetime;

    /**
     Constructs a new LandTransport object with the specified model, maximum number of passengers,
     maximum speed, and road type.
     @param model the model of the LandTransport vehicle
     @param maxPassengers the maximum number of passengers the LandTransport vehicle can carry
     @param maxSpeed the maximum speed the LandTransport vehicle can reach
     @param roadType the type of road the LandTransport vehicle can travel on
     */
    public LandTransport(String model, int maxPassengers, int maxSpeed, String dirt) {
        super(model, maxPassengers, maxSpeed);
        this.numOfWheels = 0;
        this.roadType = "";
        this.powerSource = "";
        this.energyScore = "";
        this.avgFuel = 0.0;
        this.avgLifetime = 0;


    }

    /**
     * Sets the number of wheels for this LandTransport vehicle.
     * @param numberOfWheels the number of wheels to set for this LandTransport vehicle
     */
    public void setNumberOfWheels(int numberOfWheels) {
        this.numOfWheels = numberOfWheels;
    }

    /**
     * Sets the type of road this LandTransport vehicle can travel on.
     * @param typeOfRoad the type of road to set for this LandTransport vehicle
     */
    public void setTypeOfRoad(String typeOfRoad) {
        this.roadType = typeOfRoad;
    }

    /**
     * Returns the number of wheels for this LandTransport vehicle.
     * @return the number of wheels for this LandTransport vehicle
     */
    public int getNumberOfWheels() {
        return numOfWheels;
    }

    /**
     * Returns the type of road this LandTransport vehicle can travel on.
     * @return the type of road this LandTransport vehicle can travel on
     */
    public String getTypeOfRoad() {
        return roadType;
    }

    /**
     * Returns a string representation of this LandTransport object, including its super class and road type.
     * @return a string representation of this LandTransport object
     */
    public String toString() {
        return super.toString() + ", Num wheels: " + numOfWheels +
                ", Road type: " + roadType;
    }

    /**
     * Compares this LandTransport object to the specified object for equality.
     * Returns true if and only if the specified object is also a LandTransport object,
     * the super class is equal to the specified object's super class, and the number of
     * wheels and road type are equal.
     * @param obj the object to compare to this LandTransport object for equality
     * @return true if this LandTransport object is equal to the specified object, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj) || getClass() != obj.getClass())
            return false;

        LandTransport other = (LandTransport) obj;
        return numOfWheels == other.numOfWheels &&
                roadType.equals(other.roadType);
    }
}

