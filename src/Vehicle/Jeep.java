package Vehicle;

import java.util.Objects;

/**

 Jeep class represents a jeep land transportation vehicle that implements the Motorized and Commercial interfaces.
 Inherits from the LandTransport class and adds the ability to set and get the commercial license type, the average
 fuel consumption and the average engine lifetime.
 */
public class Jeep extends LandTransport implements Motorized, Commercial{

    private String licenseType;
    private int avgFuelConsumption;
    private int avgEngineLife;

    /**
     * Constructs a new Jeep object with the given model, maximum number of passengers, maximum speed, average fuel consumption and average engine life.
     * Sets the default license type to "MINI" and the default terrain type to "Dirt".
     * @param model The model of the Jeep.
     * @param maxPassengers The maximum number of passengers the Jeep can hold.
     * @param maxSpeed The maximum speed the Jeep can travel at.
     * @param avgFuelConsumption The average fuel consumption of the Jeep.
     * @param avgEngineLife The average lifetime of the Jeep's engine.
     */
    public Jeep(String model, int maxPassengers, int maxSpeed, int avgFuelConsumption, int avgEngineLife) {
        super(model, maxPassengers, maxSpeed, "Dirt");
        this.avgFuelConsumption = avgFuelConsumption;
        this.avgEngineLife = avgEngineLife;
        this.licenseType = "MINI";
    }

    /**
     * Gets the type of the Jeep.
     * @return The type of the Jeep.
     */
    @Override
    public String getType() {
        return "Jeep";
    }

    /**
     * Gets the average fuel consumption of the Jeep.
     * @return The average fuel consumption of the Jeep.
     */
    @Override
    public int getAverageFuelConsumption() {
        return avgFuelConsumption;
    }

    /**
     * Sets the average fuel consumption of the Jeep.
     * @param fuelConsumption The new average fuel consumption of the Jeep.
     */
    @Override
    public void setAvgFuelConsumption(int fuelConsumption) {
        this.avgFuelConsumption = fuelConsumption;

    }

    /**
     * Gets the average lifetime of the Jeep's engine.
     * @return The average lifetime of the Jeep's engine.
     */
    @Override
    public int getAvgLifetime() {
        return avgEngineLife;
    }

    /**
     * Sets the average lifetime of the Jeep's engine.
     * @param avgLifetime The new average lifetime of the Jeep's engine.
     */
    @Override
    public void setAvgLifetime(int avgLifetime) {
        this.avgEngineLife = avgLifetime;
    }

    /**
     * Gets the commercial license type of the Jeep.
     * @return The commercial license type of the Jeep.
     */
    public String getLicenseType() {
        return licenseType;
    }

    /**
     * Sets the commercial license type of the Jeep.
     * @param licenseType The new commercial license type of the Jeep.
     */
    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * Gets a String representation of the Jeep object.
     * @return A String representation of the Jeep object.
     */
    public String toString() {
        return  getType() + "Model: " + getmodel() +
                ", traveled: " + getDistanceTraveled() + " [Km]" +
                ", Max Speed of " + getMaxSpeed() + " [Mph]" +
                ", can get max of " + getMaxPassenger() + " people." +
                " Commercial license: " + licenseType +
                ", Avg Fuel Consumption: " + avgFuelConsumption +
                ", Avg Engine Life: " + avgEngineLife + " rears.";
    }

    /**

     Compares the current Jeep object with another object to see if they are equal.
     @param o the object to compare
     @return true if the objects are equal, false otherwise
     */
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Jeep jeep = (Jeep) o;
        return Double.compare(jeep.avgFuelConsumption, avgFuelConsumption) == 0 &&
                avgEngineLife == jeep.avgEngineLife &&
                Objects.equals(licenseType, jeep.licenseType);
    }
}
